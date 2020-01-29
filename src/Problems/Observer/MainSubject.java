package Problems.Observer;

public interface MainSubject {

    public void store(Observer obj);
    public void logout(Observer obj);

    public void announceObservers();

    public Object newUpdate(Observer obj);
}