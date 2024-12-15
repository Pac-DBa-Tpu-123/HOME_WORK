package HW_1;

public class Task_1 {

    public static int minutesToSeconds(String time) {
        if (time == null || !time.matches("\\d{1,}:\\d{2}")) {
            return -1;
        }

        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);

        if (seconds >= 60) {
            return -1;
        }

        return minutes * 60 + seconds;
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("01:00")); // 60
        System.out.println(minutesToSeconds("13:56")); // 836
        System.out.println(minutesToSeconds("10:60")); // -1
        System.out.println(minutesToSeconds("999:59")); // 59999
        System.out.println(minutesToSeconds("12:ab")); // -1
        System.out.println(minutesToSeconds("12:09:10")); // -1
    }
}