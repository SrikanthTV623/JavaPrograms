package in.multithreading;

import java.time.LocalTime;

public class threadDemo {

    public static void main(String[] args) throws InterruptedException {
        Greet greet1 = new Greet("Hey", 100);
        Greet greet2 = new Greet("Hii", 200);

        Thread t1 = new Thread(greet1);
        Thread t2 = new Thread(greet2);

        t1.start();
        t2.start();

    }
}
class Greet implements Runnable{

    private final String message;
    private final long sleep;

    public Greet(String message, long sleep) {
        this.message = message;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(message+" "+Thread.currentThread().getName()+" "+ LocalTime.now());
            try {
                Thread.sleep(i * sleep);
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
    }
}
