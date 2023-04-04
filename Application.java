public class Application {
    public static void main(String[] args) {
        Talkative t1 = new Talkative(10);
        Talkative t2 = new Talkative(20);
        Talkative t3 = new Talkative(30);
        Talkative t4 = new Talkative(40);
        Talkative t5 = new Talkative(50);
        Talkative t6 = new Talkative(60);
        Talkative t7 = new Talkative(70);
        Talkative t8 = new Talkative(80);
        Talkative t9 = new Talkative(90);
        Talkative t10 = new Talkative(100);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        Thread th5 = new Thread(t5);
        Thread th6 = new Thread(t6);
        Thread th7 = new Thread(t7);
        Thread th8 = new Thread(t8);
        Thread th9 = new Thread(t9);
        Thread th10 = new Thread(t10);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();

        /*  When the first thread is started, it executes its run() method in its own call stack
            and because of multiple instances of the thread are started simultaneously,
            each instance will have its own call stack, and it will execute its run() method independently.
            In result, we have 100 time print of the number instantiated with the Talkative class.
            To avoid duplication of execution, we can use synchronized blocks to ensure that only one instance
            of the thread is executing.
            */
    }
}
