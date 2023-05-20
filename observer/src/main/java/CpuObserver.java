public class CpuObserver extends Observer{
 
   public CpuObserver(Server subject){
      this.subject = subject;
      this.subject.addObserver(this);
   }
 
   @Override
   public void update() {
      if(subject.getCpu() >= 80){
         System.out.println("警报：CPU当前" + subject.getCpu()+ "%即将满载，请速查明原因");
      }
   }
}