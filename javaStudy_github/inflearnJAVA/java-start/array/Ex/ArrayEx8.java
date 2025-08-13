package array.Ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하시오: ");
        int cntStudent = input.nextInt();
        int [][] students = new int[cntStudent][4];
        String[] subject = {"국어","영어","수학"};

        for(int i = 0 ; i < cntStudent;i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for(int s = 0; s < subject.length ;s++){
                System.out.print(subject[s] + "점수: ");
                students[i][s] = input.nextInt();
            }
            // 점수 총합을 더해서 [n][3] 자리에 저장하기
            for(int j = 0; j < (students[i].length - 1) ;j++){
                students[i][3] += students[i][j];
            }
        }

        for (int k = 0 ; k < students.length ; k++){
            double avg = (double) students[k][3] / (students[k].length - 1);
            System.out.println((k+1)+"번 학생의 총점: "+students[k][3]+"  ,  평균: "+avg);
        }

    }
}
