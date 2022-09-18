package Helpers;

import java.util.Random;

public class HelperClass {
    public void systemPause(int duration) {
        try {

            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");

        }
    }

    public static String getRandomNumberString(){

        Random rnd = new Random();
        int number = rnd.nextInt(1000000000);

        return String.valueOf(number);
    }
}
