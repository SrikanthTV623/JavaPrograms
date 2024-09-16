package in.multithreading;

import java.time.LocalTime;

public class threadPriority {

    public static void main(String[] args) throws InterruptedException {
        Greetings greet1 = new Greetings("Hey", 100);
        Greetings greet2 = new Greetings("Hii", 200);

        Thread t1 = new Thread(greet1);
        Thread t2 = new Thread(greet2);

        t1.start();
        t2.start();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
    }
}
class Greetings implements Runnable{

    private final String message;
    private final long sleep;

    public Greetings(String message, long sleep) {
        this.message = message;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(message+" "+Thread.currentThread().getPriority()+" "
                    +Thread.currentThread().getName()+" "+ LocalTime.now());
            try {
                Thread.sleep(i * sleep);
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
    }
}
