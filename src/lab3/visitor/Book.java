package lab3.visitor;

public class Book implements Element {

    private int price;
    private int pageNos;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Book(int price, int pageNos) {
        this.price = price;
        this.pageNos = pageNos;
    }

    public int getPrice() {
        return price;
    }

    public int getPageNos() {
        return pageNos;
    }
}
