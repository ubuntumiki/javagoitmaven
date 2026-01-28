package core.com.module_06;

import java.lang.reflect.Array;

class TotalScore {
    public int sum(int[] scores) {
//        int result = 0;
//        int index = 0;
//
//        while(true) {
//            try {
//                result += scores[index++];
//            } catch (IndexOutOfBoundsException ex) {
//                break;
//            }
//        }
        int result = 0;
        for (int ind : scores) {
            result += ind;
        }

        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
