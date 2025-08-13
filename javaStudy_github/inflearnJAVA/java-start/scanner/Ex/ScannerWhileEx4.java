package scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();
            if(option == 1){
                System.out.print("상품명을 입력하시오: ");
                String product = input.nextLine();
                System.out.print("상품의 가격을 입력하시오: ");
                int productCost = input.nextInt();
                System.out.print("구매 수량을 입력하시오: ");
                int productCount = input.nextInt();
                int cost = productCost * productCount;
                System.out.println("상품명: "+product+"/ 가격: "+productCost+"/ 수량: "+productCount+"/ 합계: "+cost);
                totalCost += cost;
            } else if(option == 2){
                System.out.println("총 비용: "+totalCost);
                totalCost = 0;
            }else if (option == 3){
                System.out.println("프로그램 종료");
                break;
            } else{
                System.out.println("잘못된 옵션 선택");
            }

        }
    }
}
