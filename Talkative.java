public class Talkative implements Runnable {
    private int a;

    public Talkative(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; ++ i) {
            System.out.println(a);
        }
    }
}
