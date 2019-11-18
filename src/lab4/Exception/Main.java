package lab4.Exception;

public class Main {

    public static void  catchWithFinally() {

    }

    public void iterate(String[] strings) throws  MyException {

    }


    public void methodThatThrowsException() throws MyException {
        Main m = new Main();
        m.iterate(new String[]{"asd", "que", null});

    }

    public static void main(String[] args) throws MyException {
        Main m = new Main();
        try {
            m.methodThatThrowsException();
        } catch(Exception e ) {
            e.printStackTrace();
        }


        try {
            m.methodThatThrowsRunException("throw");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void methodThatThrowsRunException(String s) throws RunException {

        if (s.equals("throws")) {
            throw new RunException(s);
        }

    }


}
