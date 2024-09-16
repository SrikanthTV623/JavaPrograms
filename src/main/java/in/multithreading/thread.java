package in.multithreading;

import java.time.LocalTime;

import static in.multithreading.Demo.getMessage;

public class thread {
    public static void main(String[] args) {
        getMessage("messsage 1");
        getMessage("messsage 2");
        getMessage("messsage 3");

    }

}

abstract class Demo implements Runnable{
    private String message;

    @Override
    public void run() {
        System.out.println("Thread is running.......");
    }

    static void getMessage(String message){
        for(int i=0;i<5;i++){
            System.out.println("Hello" + message + " " + LocalTime.now());
        }
    }
}