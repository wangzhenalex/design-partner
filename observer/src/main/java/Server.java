import java.util.ArrayList;
import java.util.List;

public class Server {

    private List<Observer> observers = new ArrayList<Observer>();
    private int cpu;
    private int memory;

    public void changeState(int cpu,int memory){
        this.cpu = cpu;
        this.memory = memory;
        System.out.println("CPU:" + cpu + "%,内存占用：" + memory + "%");
        notifyAllObservers();
    }
    public int getCpu() {
        return cpu;
    }


    public int getMemory() {
        return memory;
    }


    public void addObserver(Observer observer){
        observers.add(observer);      
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }  
}