public class multi_threading {
    static class Thread1 extends Thread  {
        @Override
        public  void run(){
            int i=0;
            while(i<4000) {
                i++;
            System.out.println("Thread 1 is running");
         }
        }
    }
    static class Thread2 extends Thread{
        @Override
        public void run(){
            int i=0;
            while(i<4000) {
                System.out.println("thread 2 is running...");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
