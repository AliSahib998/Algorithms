package RankingTrack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] scores = {100,100,50,40,40,20,10};
        int [] alice = {5,25,30,50,120,130};
        System.out.println(Arrays.toString(ranking(alice,scores)));
    }

    private static int [] ranking(int[] alice, int[] scores) {
        scores = Arrays.stream(scores).distinct().sorted().toArray();

        for (int i=0;i<alice.length;i++) {
            int begin = 0;
            int end = scores.length-1;
            int index = 0;
            while(begin<=end) {
                int half = (begin+end)/2;//
                if(alice[i] == scores[half]) {
                    index = scores.length-half;
                    break;
                } else if(alice[i]<scores[half]) {
                    end = half-1;
                    index = scores.length-end;
                } else if(alice[i]>scores[half]) {
                    begin = half+1;
                    index = scores.length-begin+1;
                }
            }
            alice[i]=index;

        }
        return alice;
    }



}
