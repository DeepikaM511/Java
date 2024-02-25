package MultiThreading;

public class ThreadDemo {
    public static void main(String args[]){
        RThread rt = new RThread();
        Thread t = new Thread(rt);
        t.start();
        MyThread mt = new MyThread("mtThread", 10);
        mt.start();
        MyThread nt = new MyThread("ntThread", 100);
        nt.start();

        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(750);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+" "+i*10000);
        }


    }
}
