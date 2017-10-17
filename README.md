# 진행 방법
* 웹 애플리케이션 서버에 대한 [요구사항](https://nextstep.camp/courses/-KtTs-ZFzvIWITSLbp3r/-Kf9koDWsc8jpIgwbgR5/lessons)을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

----
## 코드 리뷰 과정
> 저장소 브랜치에 자신의 github 아이디에 해당하는 브랜치가 존재해야 한다. 자신의 github 아이디에 해당하는 브랜치가 있는지 확인한다.
>
> 자신의 github 아이디에 해당하는 브랜치가 없는 경우 [브랜치 생성 요청](https://codesquad-members.slack.com/messages/C74HH4RJ8/) 채널을 통해 브랜치 생성을 요청한다.

----
1. 프로젝트를 자신의 계정으로 fork한다. 저장소 우측 상단의 fork 버튼을 활용한다.

2. fork한 프로젝트를 자신의 컴퓨터로 clone한다.
```
git clone https://github.com/{본인_아이디}/{저장소 아이디}
ex) https://github.com/javajigi/java-racingcar
```

3. clone한 프로젝트 이동
```
cd {저장소 아이디}
ex) cd java-racingcar
```

4. 본인 아이디로 브랜치를 만들기 위한 checkout
```
git checkout -t origin/본인_아이디
ex) git checkout -t origin/javajigi
```

5. commit
```
git status //확인
git rm 파일명 //삭제된 파일
git add 파일명(or * 모두) // 추가/변경 파일
git commit -m "메세지" // 커밋
```

6. 본인 원격 저장소에 올리기
```
git push origin 본인_아이디
ex) git push origin javajigi
```

7. pull request
* pull request는 github 서비스에서 진행할 수 있다.
* pull request는 반드시 original 저장소의 브랜치와 fork한 자신의 저장소 브랜치 이름이 같아야 하며, 브랜치 이름은 자신의 github 아이디여야 한다.

8. code review 및 push
* pull request를 통해 피드백을 받는다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.

## 앞의 코드 리뷰 과정은 [영상 보기](https://youtu.be/ZSZoaG0PqLg) 를 통해 참고 가능

## 실습 중 모든 질문은 [웹백엔드 java 레벨4 채널](https://codesquad-members.slack.com/messages/C74DD7R7S/)에서...

## 2017 / 10 / 16 정리

### Java BuffredReader

```java
BufferedReader br = new BufferedReader(new InputStreamReader(new InputStream()));
```

BufferdReader위와 같은 구조를 가지고 있다.

readLine() 메소드를 통해 br에 들어있는 값을 한줄씩 받아올 수 있다.

### File을 byte 형태로 읽을 

```java
Files.readAllBytes(new File("./webapp" + url).toPath());
```
Reads all the bytes from a file

Parameters: 파일의 경로

Returns: 해당 파일이 포함하고 있는 바이트 어레이 반환

Throws : IOException / OutOfMemoryError / SecurityException