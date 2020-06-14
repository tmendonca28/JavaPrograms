package com.mendonca;

public class Duration {
    public static String getDurationString(int minutes, int seconds) {
        // Check mins is <=0, return "invalid value"
        if (minutes <= 0) {
            return "Invalid value";
        }
        // Check seconds is >=0 and <=59, return "invalid value"
        if ((seconds <= 0) || (seconds >= 59)) {
            return "Invalid value";
        }
        // calculate HMS in format XXh YYm ZZs
        int hoursDuration = minutes/60;
        int minutesDuration = minutes%60;
        int secondsDuration = seconds;

        String duration = String.format("%1dh %2dm %3ds", hoursDuration, minutesDuration, secondsDuration);
        return duration;
    }

    public static String getDurationString(int seconds) {
        // Check seconds is <=0, return "invalid value"
        if (seconds <= 0) {
            return "Invalid value";
        }
        // Calculate minutes then pass it to the method above
        int mins = seconds/60;
        int secs = seconds%60;
        return getDurationString(mins, secs);
    }
}
