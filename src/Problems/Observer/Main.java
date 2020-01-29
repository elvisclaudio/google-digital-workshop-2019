package Problems.Observer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer o1 = new TopicSubscriber("1st object");
        Observer o2 = new TopicSubscriber("2nd object");
        Observer o3 = new TopicSubscriber("3rd object");
        Observer o4 = new TopicSubscriber("4th object");

        Observer[] objects = new Observer[]{o1, o2, o3, o4};

        for(Observer singleObj : objects) {
            topic.store(singleObj);
            singleObj.setSubject(topic);
            singleObj.update();
            //topic.logout(singleObj);
        }

        topic.storeMessage("New Message was stored and pushed");
    }

}
