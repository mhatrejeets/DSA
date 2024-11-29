public class MultiThreading1 {
    public static void main(String[] args) {
        Thread thread1 = new CustomThread("Thread 1", 3);
        Thread thread2 = new CustomThread("Thread 2", 5);

        thread1.start();
        thread2.start();
    }
}
class CustomThread extends Thread {
    private int stopCount;

    public CustomThread(String name, int stopCount) {
        super(name);
        this.stopCount = stopCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= stopCount; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            if (i == stopCount) {
                System.out.println(Thread.currentThread().getName() + " stopped.");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
