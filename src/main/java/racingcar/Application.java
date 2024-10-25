package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        String attemptCountString = Console.readLine();
        int attemptCount = Integer.parseInt(attemptCountString);

        List<Car> carList = splitCarNames(carNames, attemptCount);

        Race race = new Race();

        race.start(carList, attemptCount);

    }

    public static List<Car> splitCarNames(String carNames, int attemptCount) {
        String[] carNamesArray = carNames.split(",");
        if (carNamesArray.length < 2) {
            throw new IllegalArgumentException("자동차 1개 입력");
        }
        List<Car> carNameList = new ArrayList<>();

        for (String carName : carNamesArray) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름 5자 초과");
            }
            carNameList.add(new Car(carName, attemptCount));
        }

        return carNameList;
    }
}
