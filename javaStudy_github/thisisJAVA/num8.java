package ch05.secCheck;

public class num8 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int numSum = 0;
		double numAvg = 0;
		int numCnt = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				numSum += array[i][j];
				
			}
			numCnt += array[i].length;
		}
		numAvg = (double) numSum/numCnt;
		System.out.println("배열의 합: "+numSum);
		System.out.println("배열의 평균: "+numAvg);
	}

}
