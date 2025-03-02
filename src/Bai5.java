import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length, width;
        System.out.print("Nhập chiều dài: ");
        length = scanner.nextInt();

        System.out.print("Nhập chiều rộng");
        width = scanner.nextInt();

        int area = calculateArea(length, width);
        int perimeter = calculatePerimeter(length, width);

        System.out.print("Diện tích :");
        System.out.println(area);
        System.out.print("Chu vi :");
        System.out.println(perimeter);

        scanner.close();
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}
