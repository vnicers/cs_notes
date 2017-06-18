import com.sun.org.apache.xml.internal.dtm.ref.IncrementalSAXSource_Xerces;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by kelp on 2017/5/29.
 */
@Slf4j
public class ThreadBadSync {
    private static long num;

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new IncrementNumberTask());
        Thread t2=new Thread(new IncrementNumberTask());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        log.info("{}",num);
    }

    private static class  IncrementNumberTask implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<100000;i++){
                // FIXME 这里不能使用this 因为 thread start了两个不同IncrementNumberTask 实例
                synchronized (this){
                    ThreadBadSync.num++;
                }
            }
        }
    }
}
