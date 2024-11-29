import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int num = random.nextInt(100);
                System.out.println("Generated number: " + num);
                if (num % 2 == 0) {
                    synchronized (ThreadingInJava.squareThread) {
                        ThreadingInJava.squareThread.setNumber(num);
                        ThreadingInJava.squareThread.notify();
                    }
                } else {
                    synchronized (ThreadingInJava.cubeThread) {
                        ThreadingInJava.cubeThread.setNumber(num);
                        ThreadingInJava.cubeThread.notify();
                    }
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SquareThread extends Thread {
    private int number;

    public synchronized void setNumber(int num) {
        this.number = num;
    }

    public void run() {
        try {
            while (true) {
                synchronized (this) {
                    wait();
                    System.out.println("Square: " + (number * number));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CubeThread extends Thread {
    private int number;

    public synchronized void setNumber(int num) {
        this.number = num;
    }

    public void run() {
        try {
            while (true) {
                synchronized (this) {
                    wait();
                    System.out.println("Cube: " + (number * number * number));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadingInJava {
    public static SquareThread squareThread;
    public static CubeThread cubeThread;

    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        squareThread = new SquareThread();
        cubeThread = new CubeThread();

        randomNumberGenerator.start();
        squareThread.start();
        cubeThread.start();
    }
}
