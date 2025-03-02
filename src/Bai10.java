import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lớn thứ nhất: ");
        String num1 = scanner.nextLine();
        System.out.print("Nhập số lớn thứ hai: ");
        String num2 = scanner.nextLine();
        System.out.print("Nhập số mũ: ");
        int exponent = scanner.nextInt();

        String sum = addStrings(num1, num2);
        String difference = subtractStrings(num1, num2);
        String product = multiplyStrings(num1, num2);
        String quotient = divideStrings(num1, num2);
        String remainder = moduloStrings(num1, num2);
        String power = powerStrings(num1, exponent);

        System.out.println("\nKết quả các phép toán:");
        System.out.println("Tổng       (+) : " + sum);
        System.out.println("Hiệu       (-) : " + difference);
        System.out.println("Tích       (*) : " + product);
        System.out.println("Thương     (/) : " + quotient);
        System.out.println("Modulo     (%) : " + remainder);
        System.out.println("Lũy thừa   (^) : " + power);

        scanner.close();
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;
        }
        return result.reverse().toString();
    }

    public static String subtractStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int borrow = 0, i = num1.length() - 1, j = num2.length() - 1;

        while (i >= 0 || j >= 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int diff = digit1 - digit2 - borrow;

            borrow = diff < 0 ? 1 : 0;
            result.append(diff < 0 ? diff + 10 : diff);
        }
        return result.reverse().toString().replaceFirst("^0+", "");
    }

    public static String multiplyStrings(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder product = new StringBuilder();
        for (int num : result) {
            if (!(product.length() == 0 && num == 0)) product.append(num);
        }

        return product.length() == 0 ? "0" : product.toString();
    }

    public static String divideStrings(String num1, String num2) {
        if (num2.equals("0")) return "Không thể chia cho 0";
        StringBuilder result = new StringBuilder();
        String temp = "";

        for (char digit : num1.toCharArray()) {
            temp += digit;
            int quotient = 0;
            while (compareStrings(temp, num2) >= 0) {
                temp = subtractStrings(temp, num2);
                quotient++;
            }
            result.append(quotient);
        }
        return result.toString().replaceFirst("^0+", "");
    }

    public static String moduloStrings(String num1, String num2) {
        if (num2.equals("0")) return "Không thể chia cho 0";
        String temp = "";

        for (char digit : num1.toCharArray()) {
            temp += digit;
            while (compareStrings(temp, num2) >= 0) {
                temp = subtractStrings(temp, num2);
            }
        }
        return temp;
    }

    public static String powerStrings(String base, int exponent) {
        String result = "1";
        while (exponent-- > 0) result = multiplyStrings(result, base);
        return result;
    }

    public static int compareStrings(String num1, String num2) {
        num1 = num1.replaceFirst("^0+", "");
        num2 = num2.replaceFirst("^0+", "");
        return num1.length() > num2.length() ? 1 : num1.length() < num2.length() ? -1 : num1.compareTo(num2);
    }
}
