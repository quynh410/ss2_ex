import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giờ ban đầu:");
        int hours = scanner.nextInt();
        System.out.println("Nhập phút ban đầu:");
        int minutes = scanner.nextInt();
        System.out.println("Nhập giây ban đầu:");
        int seconds = scanner.nextInt();
        System.out.println("Nhập số giờ cần cộng:");
        int addHours = scanner.nextInt();
        System.out.println("Nhập số phút cần cộng:");
        int addMinutes = scanner.nextInt();
        System.out.println("Nhập số giây cần cộng:");
        int addSeconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        int addTotalSeconds = addHours * 3600 + addMinutes * 60 + addSeconds;

        totalSeconds += addTotalSeconds;

        int newHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int newMinutes = remainingSeconds / 60;
        int newSeconds = remainingSeconds % 60;

        System.out.println("Thời gian ban đầu: " + hours + " giờ " + minutes + " phút " + seconds + " giây");
        System.out.println("Thời gian cộng thêm: " + addHours + " giờ " + addMinutes + " phút " + addSeconds + " giây");
        System.out.println("Thời gian sau khi cộng: " + newHours + " giờ " + newMinutes + " phút " + newSeconds + " giây");
        scanner.close();
    }
}
