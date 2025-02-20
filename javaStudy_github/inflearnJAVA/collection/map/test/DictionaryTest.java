package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    // 문제5 - 영어 사전 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.println("영어 단어를 입력하세요 (종료는 'q'):");
            String EngWord = sc.nextLine();

            if (EngWord.equals("q")){
                break;
            }

            System.out.println("한글 뜻을 입력하세요: ");
            String KoWord = sc.nextLine();

            map.put(EngWord, KoWord);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q'):");
            String EngWord = sc.nextLine();

            if (EngWord.equals("q")){
                break;
            }
            if (map.containsKey(EngWord)) {
                System.out.println(EngWord+ "뜻: "+map.get(EngWord));
            }else {
                System.out.println(EngWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
