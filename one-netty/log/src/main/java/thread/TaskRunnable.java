package thread;

public class TaskRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程"+ Thread.currentThread().getName()+"=="+i);
        }
    }
}