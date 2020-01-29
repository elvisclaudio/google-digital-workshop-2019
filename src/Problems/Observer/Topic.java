package Problems.Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements MainSubject {

    private List<Observer> observers;
    private String message;
    private boolean changedStatus;
    private final Object MUTEX= new Object();

    public Topic(){
        this.observers=new ArrayList<>();
    }
    @Override
    public void store(Observer obj) {

        if(obj == null)
            throw new NullPointerException("Observer has a null value therefor we can not procced foward!");

        synchronized (MUTEX) {

            if(observers.contains(obj)) {
                return;
            }

            observers.add(obj);
        }

    }

    @Override
    public void logout(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void announceObservers() {
        List<Observer> myObservers = null;
        synchronized (MUTEX) {
            if (!changedStatus)
                return;
            myObservers = new ArrayList<>(this.observers);
            this.changedStatus=false;
        }

        for (Observer obj : myObservers) {
            obj.update();
        }

    }

    @Override
    public Object newUpdate(Observer obj) {
        return this.message;
    }


    public void storeMessage(String message){
        System.out.println("Now we got our message posted under topic:" + message);
        this.message = message;
        this.changedStatus = true;
        this.announceObservers();
    }

}