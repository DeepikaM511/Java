package MultiThreading;

public class sleepMethod extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        sleepMethod t1 = new sleepMethod();
        sleepMethod t2 = new sleepMethod();
        t2.run();
        t1.start();
        t2.start();

    }
}
