public class Bai4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println((a && b) ? "Cả hai đều đúng" : "");
        System.out.println((a || b) ? "Ít nhất một đúng" : "");
        System.out.println((!a && b) ? "Không đúng" : "");

        System.out.println("Giá trị ban đầu của c: " + c);
        c = !c;
        System.out.println("Giá trị của c sau khi đảo ngược: " + c);

        System.out.println(((a || b) && !c) ? "Điều kiện phức tạp đúng" : "Điều kiện phức tạp sai");
    }
}