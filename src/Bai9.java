import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày, tháng, năm: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        int[] daysInMonth = {0, 31, isLeapYear(year) * 29 + (1 - isLeapYear(year)) * 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nextDay = (day % daysInMonth[month]) + 1;
        int nextMonth = month + (day / daysInMonth[month]);
        int nextYear = year + (nextMonth / 13);
        nextMonth = (nextMonth % 12) + ((nextMonth % 12 == 0) ? 12 : 0);

        System.out.println("Ngày tiếp theo: " + nextDay + "/" + nextMonth + "/" + nextYear);

        System.out.println("Nhập ngày thứ hai (ngày tháng năm): ");
        int d2 = scanner.nextInt(), m2 = scanner.nextInt(), y2 = scanner.nextInt();

        int daysBetween = Math.abs(toDays(day, month, year) - toDays(d2, m2, y2));
        System.out.println("Số ngày giữa hai ngày: " + daysBetween + " ngày");

        scanner.close();
    }

    public static int isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? 1 : 0;
    }

    public static int toDays(int day, int month, int year) {
        int[] daysInMonth = {0, 31, isLeapYear(year) * 29 + (1 - isLeapYear(year)) * 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day + IntStream.range(1, month).map(i -> daysInMonth[i]).sum()
                + (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
    }
}
