package com.duckrace;

import java.util.List;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer10 = new DuckRacer(10, "Kevin");
        System.out.println(racer10);


        // make it win a few times

        racer10.win(Reward.DEBIT_CARD);
        racer10.win(Reward.PRIZES);
        racer10.win(Reward.DEBIT_CARD);
        System.out.println(racer10);

        // cheat by getting the rewards list and calling add() right from here
        // when set as read-only, manipulation cannot be done, and unsupported operation exception error will pop

        List<Reward> rewardList = racer10.getRewards();
        rewardList.add(Reward.DEBIT_CARD);
        rewardList.add(Reward.DEBIT_CARD);
        rewardList.add(Reward.DEBIT_CARD);
        System.out.println(racer10);

        // just shows the rewards
        System.out.println(rewardList);

        // make it win again, and review rewardslist for addition
        racer10.win(Reward.DEBIT_CARD);
        System.out.println(rewardList);
    }
}
