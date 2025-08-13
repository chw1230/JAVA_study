package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int [] student;
        student = new int[5];

        // 변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        System.out.println("student1 점수 = " + student[0]);
        System.out.println("student2 점수 = " + student[1]);
        System.out.println("student3 점수 = " + student[2]);
        System.out.println("student4 점수 = " + student[3]);
        System.out.println("student5 점수 = " + student[4]);
    }
}
