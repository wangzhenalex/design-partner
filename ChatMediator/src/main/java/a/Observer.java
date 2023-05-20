package a;

public abstract class Observer {
   protected Server subject;
   public abstract void update();
}