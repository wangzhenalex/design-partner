package a;

public class MemoryObserver extends Observer{
 
   public MemoryObserver(Server subject){
      this.subject = subject;
      this.subject.addObserver(this);
   }
 
   @Override
   public void update() {
      if(subject.getMemory() >= 80){
         System.out.println("警报：服务器内存已占用超过" + subject.getMemory() + "%，请速查明原因");
      }
   }
}