package array.Ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {

            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1){
                if(productCount == 10){
                    System.out.println("등록할 수 있는 상품의 개수를 넘었습니다.");
                    break;
                }
                System.out.print("상품 이름을 입력하시오: ");
                productNames[productCount] = input.nextLine();
                System.out.print("상품 가격을 입력하시오: ");
                productPrices[productCount] = input.nextInt();
                productCount++;

            } else if (option ==  2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    // continue;
                }
                for(int i = 0; i < productCount ; i++){
                    System.out.println(productNames[i]+": "+productPrices[i]+"원");
                }
            } else if ( option == 3) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("잘못된 옵션 선택");
            }
        }
    }
}
