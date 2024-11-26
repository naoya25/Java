public class Calendar {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getLastDay(int year, int month) {
        int[] mDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month < 1 || month > 12) {
            return 0;
        }

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return mDays[month - 1];
    }

    public static void main(String[] args) {
        int year = 2023;
        System.out.println(year + "年はうるう年か？ ");
        if (isLeapYear(year)) {
            System.out.println("うるう年です");
        } else {
            System.out.println("うるう年ではありません");
        }
    }
}
