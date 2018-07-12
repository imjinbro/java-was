package webserver.request;

import exception.NotFoundRequestParameterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.RequestUtils;
import webserver.HttpMethod;

import java.util.List;

import static util.RequestUtils.splitPathAndParams;

class RequestLine {
    private static final Logger log = LoggerFactory.getLogger(RequestLine.class);

    private final HttpMethod method;
    private final String path;
    private final RequestParameter parameter;

    RequestLine(String requestLine) {
        log.debug("request line : {}", requestLine);

        List<String> lines = RequestUtils.splitRequestLine(requestLine);
        method = HttpMethod.get(lines.get(0));

        List<String> pathAndParamsToken = splitPathAndParams(lines.get(1));
        path = pathAndParamsToken.get(0);
        parameter = new RequestParameter(RequestUtils.splitQueryString(pathAndParamsToken.stream().filter(o -> pathAndParamsToken.indexOf(o) > 0).findFirst().orElse(null)));
    }

    String getMethod() {
        return method.name();
    }

    String getPath() {
        return path;
    }

    String getParam(String key) {
        if (parameter.isEmpty() || !parameter.containsKey(key)) {
            throw new NotFoundRequestParameterException();
        }
        return parameter.get(key);
    }

    RequestParameter getParameters() {
        return parameter;
    }
}