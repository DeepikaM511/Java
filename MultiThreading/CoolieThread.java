package MultiThreading;

public class CoolieThread  implements Runnable{
    String jobno;

    public CoolieThread(String jnno) {
        this.jobno = jnno;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" starting job no-"+jobno);
        doJob();
        System.out.println(Thread.currentThread().getName()+" ending job");


    }

    private void doJob() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

