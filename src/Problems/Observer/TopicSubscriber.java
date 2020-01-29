package Problems.Observer;

public class TopicSubscriber implements Observer {


    private String name;
    private MainSubject topic;

    public TopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.newUpdate(this);
        if(message == null){
            System.out.println(name+":: No new message to be read");
            return;
        }

        System.out.println(name+"::  Message to be consumed ::" +  message);
    }

    @Override
    public void setSubject(MainSubject subject) {
        this.topic = subject;
    }

}
