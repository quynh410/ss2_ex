public class Bai2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        System.out.println("Tổng của " + a + " và " + b + " là: " + sum);
        System.out.println("Hiệu của " + a + " và " + b + " là: " + difference);
        System.out.println("Tích của " + a + " và " + b + " là: " + product);
        if (b != 0) {
            int quotient = a / b;
            int remainder = a % b;
            System.out.println("Thương của " + a + " chia cho " + b + " là: " + quotient);
            System.out.println("Phần dư của " + a + " chia cho " + b + " là: " + remainder);
        } else {
            System.out.println("Không thể thực hiện phép chia cho 0.");
        }
    }
}
