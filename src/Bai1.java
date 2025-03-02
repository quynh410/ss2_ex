public class Bai1 {
    public static void main(String[] args) {
        int soNguyen = 10;
        float soThuc = 5.75f;
        char kyTu = 'Q';
        String chuoi = "Hello, Rikkei Academy!";
        int tongHaiSoNguyen = soNguyen + 15;
        float banKinh = 7.5f;
        double dienTichHinhTron = Math.PI * Math.pow(banKinh, 2);
        System.out.println("Giá trị của biến int: " + soNguyen);
        System.out.println("Giá trị của biến double: " + soThuc);
        System.out.println("Giá trị của biến char: " + kyTu);
        System.out.println("Giá trị của biến String: " + chuoi);
        System.out.println("Tổng hai số nguyên: " + tongHaiSoNguyen);
        System.out.println("Diện tích hình tròn với bán kính " + banKinh + " là: " + dienTichHinhTron);
    }
}
