import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Created by kelp on 2017/5/27.
 */
@Slf4j
public class ThreadInterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread myTask= new Thread(new TaskThread());
        myTask.start();
        TimeUnit.MILLISECONDS.sleep(500);
        // stop方法强制终端线程，会导致线程强制终端，释放所有的锁，导致数据不一致
        // myTask.stop();
        myTask.interrupt();
        // myTask.suspend();
        log.info("线程中断");
    }

    private static class TaskThread implements Runnable{

        @Override
        public void run() {
            int i=0;
            while(i<10000000){
                if(Thread.currentThread().isInterrupted()){
                    break;
                }
                log.info("正在干活:{}",i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    // 防止在Sleep的时候被中断，清空标志位，重新中断一次,否则会线程会继续执行
                    log.warn("线程在sleep的时候中断了");
                    Thread.currentThread().interrupt();
                }
                i++;
            }
        }
    }
}
