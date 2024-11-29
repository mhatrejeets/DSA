import java.util.Random;

class NumberGenerator implements Runnable {
    private Random random = new Random();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                int num = random.nextInt(100); // Generate a random integer between 0 and 99
                System.out.println("Generated number: " + num);
                if (num % 2 == 0) {
                    ThreadSquare threadSquare = new ThreadSquare(num);
                    Thread t1 = new Thread(threadSquare);
                    t1.start();
                } else {
                    ThreadCube threadCube = new ThreadCube(num);
                    Thread t2 = new Thread(threadCube);
                    t2.start();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadSquare implements Runnable {
    private int num;

    public ThreadSquare(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Square of " + num + ": " + (num * num));
    }
}

class ThreadCube implements Runnable {
    private int num;

    public ThreadCube(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + num + ": " + (num * num * num));
    }
}

public class MultithreadingLab {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread t = new Thread(numberGenerator);
        t.start();
    }
}
