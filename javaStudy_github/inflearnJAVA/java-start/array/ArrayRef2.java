package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int [] student;
        student = new int[5];

        // 변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;


        for(int i =0;i<student.length;i++){
            System.out.println("student"+(i+1)+" 점수 = " + student[i]);
        }

    }
}
