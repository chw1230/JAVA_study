package thread.control;

public class CheckExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckRunnable implements Runnable {
        @Override
        public void run() /*throws Exception*/  {
//            throw new Exception(); // 던질 수 없음 -> 오류 발생
        }
    }
}
