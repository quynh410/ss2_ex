import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        // Nhập và in thông tin sinh viên
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Thông báo nhập
        System.out.println("Nhập mã sinh viên:");
        String studentId = scanner.nextLine();

        System.out.println("Nhập tên sinh viên:");
        String studentName = scanner.nextLine();

        // Nhập tuổi sinh viên
        System.out.println("Nhập tuổi sinh viên:");
//        int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        scanner.nextLine(); // Xử lý ký tự xuống dòng còn sót lại

        // Nhập giới tính sinh viên
        System.out.println("Nhập giới tính sinh viên (nam/nữ):");
//        String gender = scanner.nextLine();
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        // Nhập địa chỉ sinh viên
        System.out.println("Nhập địa chỉ sinh viên:");
        String address = scanner.nextLine();

        // In thông tin sinh viên vừa nhập
        System.out.println("======== THÔNG TIN SINH VIÊN ========");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age + " | Giới tính: " + gender + " | Địa chỉ: " + address);
        scanner.close();
    }
}
