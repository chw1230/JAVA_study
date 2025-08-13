package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 x 3  2차원 배열
        int [][] arr = new int[3][3];

        int i = 1;
        for (int row=0;row< arr.length;row++){
            for(int colum = 0; colum < arr[row].length; colum++){
                arr[row][colum] = i++;
            }
        }

        //출력
        for (int row=0;row< arr.length;row++){
            for(int colum = 0; colum < arr[row].length; colum++){
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
