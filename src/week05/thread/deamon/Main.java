package week05.thread.deamon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("demon");
            }
        };

        // 우선순위가 낮다는 건 상대적으로 리소스를 적게 할당받음
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("task");
        }
    }
}
