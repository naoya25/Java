/*
 * 日付クラス
 */

public class Data {
    // private int year; // 年
    // private int mon; // 月
    // private int day; // 日

    public static boolean isEqual(int y1, int m1, int d1, int y2, int m2, int d2) {
        return y1 == y2 && m1 == m2 && d1 == d2;
    }

    public static boolean isBefore(int y1, int m1, int d1, int y2, int m2, int d2) {
        if (y1 < y2) {
            return true;
        } else if (y1 > y2) {
            return false;
        }

        if (m1 < m2) {
            return true;
        } else if (m1 > m2) {
            return false;
        }

        return d1 < d2;
    }

    public static boolean isAfter(int y1, int m1, int d1, int y2, int m2, int d2) {
        if (y1 > y2) {
            return true;
        } else if (y1 < y2) {
            return false;
        }

        if (m1 > m2) {
            return true;
        } else if (m1 < m2) {
            return false;
        }

        return d1 > d2;
    }
}
