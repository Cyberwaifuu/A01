public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Worker());
        Thread thread2 = new Thread(new Worker());

        thread1.start();
        thread2.start();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            singleton.showWork();
        }
    }
}
