//package lab5.exchange;
//
//import java.util.Currency;
//
//public class ExchangeDesk {
//
//    public <T extends  Currency,V extends Currency>  T convert(V from, Class dest, double rate) {
//        T toReturn = null;
//        double value = from.getAmount() * rate;
//        try {
//            dest.getDeclaredConstructor().newInstance(value);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return toReturn;
//
//    }
//}
