package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int [] student;
        student = new int[]{90, 80, 70, 60, 50};


        for(int i =0;i<student.length;i++){
            System.out.println("student"+(i+1)+" 점수 = " + student[i]);
        }

    }
}
