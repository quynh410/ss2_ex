import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.println("------------Nhập thông tin sinh viên------------");
        System.out.print("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();

        System.out.print("Nhập số điện thoại sinh viên: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Nhập ngày sinh sinh viên (dd/MM/yyyy): ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính sinh viên (1: Nam, 0: Nữ): ");
        int genderInput = scanner.nextInt();
        String gender = (genderInput == 1) ? "Nam" : "Nữ";

        // Input student grades
        System.out.println("\n------------Nhập điểm sinh viên------------");
        System.out.print("Nhập điểm Toán: ");
        double math = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double physics = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Nhập điểm Sinh học: ");
        double biology = scanner.nextDouble();

        System.out.print("Nhập điểm Ngoại ngữ: ");
        double foreignLanguage = scanner.nextDouble();

        double averageGrade = (math + physics + chemistry + biology + foreignLanguage) / 5;

        System.out.println("\n------------Hiển thị thông tin sinh viên------------");
        System.out.printf("Mã sinh viên: %s  |  Tên sinh viên: %s  |  Giới tính: %s%n", studentId, studentName, gender);
        System.out.printf("Ngày sinh: %s  |  Số điện thoại: %s%n", dateOfBirth, phoneNumber);
        System.out.printf("Điểm Toán: %.2f  |  Điểm Vật lý: %.2f  |  Điểm Hóa học: %.2f  |  Điểm Sinh học: %.2f  |  Điểm Ngoại ngữ: %.2f%n",
                math, physics, chemistry, biology, foreignLanguage);
        System.out.printf("Điểm trung bình: %.2f%n", averageGrade);

        scanner.close();
    }
}
