package ch04.check;

public class twoDiceSumFive {
	public static void main(String[] args) {
		boolean run = true;
		int d1=0,d2=0;
		while(run) {
			d1 = (int)(Math.random()*6) +1;
			d2 = (int)(Math.random()*6) +1;
			System.out.println("("+d1+","+d2+")");
			if((d1+d2)==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
		/* while 다른 조건
		while(d1+d2 !=5 ) {
			d1 = (int)(Math.random()*6) +1;
			d2 = (int)(Math.random()*6) +1;
			System.out.println("("+d1+","+d2+")");
		}
		System.out.println("프로그램 종료");*/
	}
}
