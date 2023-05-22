package com.sda.she_likes_java.exeptions;
public class SecretExample {

    public static void main(String[] args) {
        SecretLocker secretStorage = new SecretLocker(
                null
        );

        System.out.println("I know Your secret now!!!");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy biggest secret was: " + enemySecret);

        try {
            System.out.println("Inside try block");
            Secret enemysSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemy's secret: " + enemysSecret);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Let's play again with our own exceptions");
        try {
            Secret stupidSecret = secretStorage.decrypt();
        } catch (HSMConnectionException e) {
            System.out.println("connection issue");
        } catch (DecryptionIssueException e) {
            System.out.println("cannot decrypt enemy secret");
        }

        System.out.println("Now with single catch");

        try {
            secretStorage.decrypt();
        } catch (Exception e) {
            System.out.println("Generic catch all :)");
        }
    }
}




