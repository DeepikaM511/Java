package MultiThreading;

public class Daemon extends Thread{
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
        Daemon t1=new Daemon();
        Daemon t2=new Daemon();
        t1.start();
        t1.setDaemon(true);//will throw exception here
        t2.start();
    }
}
