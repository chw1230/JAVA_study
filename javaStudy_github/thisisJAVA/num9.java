package ch05.secCheck;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		boolean run = true;
		int[] score = null;
		int max = 0;
		int sum=0;
		double avg=0.0;
		
		while(run) {
			Scanner scanner = new Scanner(System.in);	
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			String num = scanner.nextLine();
			
			switch(num) {
				case "1":
					System.out.println("학생수> ");
					String stu = scanner.nextLine();
					int stuNum = Integer.parseInt(stu);//배열을 위해 문자열을 정수롤 변환
					score = new int[stuNum];
				break;
				case "2":
					for(int i =0;i<score.length;i++) {
						System.out.println("score["+i+"]>");
						String nstr = scanner.nextLine();
						int nint = Integer.parseInt(nstr);
						score[i] = nint;
					}
				break;
				case "3":
					for(int j =0;j<score.length;j++) {
						System.out.println("score["+j+"]:"+score[j]);
					}
				break;
				case "4":
					for(int k =0;k<score.length;k++) {
						if(score[k]>max) max = score[k];
						sum += score[k];
						
					}
					avg = (double) sum/score.length;
					System.out.println("최고 점수: "+max);
					System.out.println("평균 점수: "+avg);
				break;
				case "5":
					System.out.println("프로그램 종료");
					run = false;
				break;
			}
		}    
	}
}
