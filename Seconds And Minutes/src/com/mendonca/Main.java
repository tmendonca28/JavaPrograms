package com.mendonca;

public class Main {

    public static void main(String[] args) {
        Duration duration = new Duration();
        String answer = duration.getDurationString(65, 45);
        String answerSeconds = duration.getDurationString(3945);
        System.out.println(answer);
        System.out.println(answerSeconds);
    }
}
