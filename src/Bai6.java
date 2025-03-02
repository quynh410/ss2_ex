public class Bai6 {
    public static void main(String[] args) {
        String studentName = "Nguyễn Thị Thu Quỳnh";
        float mathScore = 7.8f;
        float physicsScore = 8.0f;
        float chemistryScore = 8.0f;

        double averageScore = calculateAverage(mathScore, physicsScore, chemistryScore);
        String classification = classifyStudent(averageScore);

        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Điểm trung bình: " + averageScore);
        System.out.println("Xếp loại: " + classification);
    }

    public static double calculateAverage(float math, float physics, float chemistry) {
        return (math + physics + chemistry) / 3;
    }

    public static String classifyStudent(double average) {
        return (average >= 8.0) ? "Giỏi" :
                (average >= 6.5) ? "Khá" :
                        (average >= 5.0) ? "Trung bình" : "Yếu";
    }
}
