
import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new LinkedList<>();

    /**
     * 增加观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notice(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
