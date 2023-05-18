package com.sda.she_likes_java.exeptions;

import java.util.Random;

public class BankConnector {

    public Integer accountBalance() throws Exception {
        //trying to connect to real account :)
        Random random = new Random();
        int randomNumber = random.nextInt();

        //100 % 2 ->0
        //101 % 2 ->1

        if (randomNumber % 2 == 0) {
            return 1000;

        } else {
            System.out.println("network error");
            throw new Exception("connection error");

        }
    }

    public Integer accountBalanceAlwaysSuccessful() {
        Random random = new Random();
        int randomNumber = random.nextInt();


        return 100;

    }
}
