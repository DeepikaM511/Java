package MultiThreading;

    public class CreatingThread  implements Runnable{
        public void run(){
            System.out.println("thread is running...");
        }
        public static void main(String args[]) {
            CreatingThread m1 = new CreatingThread();
            Thread t1 = new Thread(m1,"First");
            Thread t2 = new Thread(m1);
            t1.start();
            System.out.println(t1.getName());
            t2.start();
        }
    }

