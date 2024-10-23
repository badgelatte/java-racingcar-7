# java-racingcar-precourse


## 프로그래밍 요구 사항
* JDK 21버전에서 실행 가능해야 한다
* 프로그램 실행의 시작점은 Application의 main()이다
* build.gradle 파일은 변경할 수 없음
* 제공된 라이브러리 이외의 외부 라이브러리는 사용 금지
* 프로그램 종료 시 System.exit()를 호출 금지
* 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
* 자바 코드 컨벤션을 지키면서 프로그래밍
* indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현 (2까지만 허용)
  - ex) while문 안에 if문이 있으면 들여쓰기는 2
  - indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 됨
* 3항 연산자 사용하지 않기
* 함수(또는 메소드)가 한가지 일만 하도록 최대한 작게 만들기
* JUnit 5와 Assert J를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다

## 요구 사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈추기 가능
* 각 자동차에 이름 부여 가능
  - 전진하는 자동차를 출력할 때 자동차 이름 같이 출력
* 자동차 이름
  - 쉼표(,)를 기준으로 구분
  - 이름은 5자 이하만 가능
* 사용자는 몇 번의 이동을 할 것인지 입력 가능
* 전진하는 조건은 0~9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우
* 자동차 경주 게임 완료 후 누가 우승했는지 알리기
  - 우승자는 한 명 이상 가능
  - 우승자가 여려 명일 경우 쉼표(,)를 이용하여 구분
* 사용자가 잘못된 값을 입력한 경우 IllegalArgumentException을 발생시킨 후 애플리케이션을 종료되어야한다

## 구현 기능 목록
1. 입력 값 추출
   - [o] camp.nextstep.edu.missionutils에서 제공하는 Console API 사용
   - [o] 경주할 자동차 이름 입력하기
   - [o] 시도할 횟수 입력하기
2. 입력된 문자열 분리
   - [o] 쉼표(,)를 기준으로 분리
3. 자동차 전진 조건
   - [] 0~9 사이의 무작위 값 (4 이상)
4. 출력
   - [] 누가 우승하였는지 알리기
   - [] 쉼표(,)를 이용하여 공동 우승자도 표기 가능
   - 
5. 사용자가 잘못된 값 입력 시 IllegalArgumentException 발생 후 애플리케이션 종료
   - [] 자동차가 1개일 경우
   - [] 자동차 이름이 5자 초과일 경우
   - [] 자동차 전진 조건을 지키지 못한 경우