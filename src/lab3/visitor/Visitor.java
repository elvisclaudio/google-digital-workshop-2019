package lab3.visitor;

public class Visitor {

    public int totalPrice = 0;
    public int totalTime = 0;

    public void visit (Book book) {
       totalTime +=  book.getPageNos();
       totalPrice +=  book.getPrice();

    }

    public void visit (Video video) {
        totalTime +=  video.getTime();
        totalPrice +=  video.getPrice();
    }
}