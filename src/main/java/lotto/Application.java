package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        List<Integer> lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }


}
