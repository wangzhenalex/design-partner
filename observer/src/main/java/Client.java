import java.util.Random;

public class Client {
   public static void main(String[] args) throws InterruptedException {
      Server subject = new Server();
      new CpuObserver(subject);
      new MemoryObserver(subject);
      while(true) {
         int cpu = new Random().nextInt(100);
         int memory = new Random().nextInt(100);
         subject.changeState(cpu, memory);
         Thread.sleep(5000);
      }
   }
}