package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] name = {"학생1", "학생2","학생3"};
        int[] age = {15, 16,17};
        int[] grade = {90, 80,70};

        for (int i =0 ; i< name.length;i++){
            System.out.println("이름: "+name[i] + " 나이: "+age[i]+" 성적: "+grade[i]);
        }
    }
}
