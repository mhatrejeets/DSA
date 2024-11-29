class App extends Thread {
    private String threadName;

    public App(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);

            // Simulate some work or delay
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class MultiThreading {

    public static void main(String[] args) {
        // Create and start two threads
        App a1 = new App("App Object 1");
        App a2 = new App("App Object 2");

        a1.start();
        a2.start();
    }
}