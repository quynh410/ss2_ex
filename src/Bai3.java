public class Bai3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        if (x > y) {
            System.out.println("x lớn hơn y");
        } else if (x < y) {
            System.out.println("x nhỏ hơn y");
        } else {
            System.out.println("x bằng y");
        }
    }
    }

