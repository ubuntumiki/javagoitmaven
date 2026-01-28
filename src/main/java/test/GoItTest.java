package test;

import java.util.Arrays;

public class GoItTest {
    public static void main(String[] args) {
        String dev = "I want to be a Java Developer";

        System.out.println(Arrays.toString(dev.getBytes()));

        String love = "I love my Lyolya (-;";
        System.out.println(Arrays.toString(love.getBytes()));
        System.out.println(Arrays.toString(love.toCharArray()));

        byte[] loveBytes = {73, 32, 108, 111, 118, 101, 32, 109, 121, 32, 76, 121, 111, 108, 121, 97, 32, 40, 45, 59};
        System.out.println(new String(loveBytes));
    }
}
