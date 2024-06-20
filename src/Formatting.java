import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        String result2 = currency.format(123.89);
        System.out.println(result);
        System.out.println(result2);


        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String ansewer = percentInstance.format(0.1);
        System.out.println(ansewer);


        String fix =  NumberFormat.getPercentInstance().format(0.1);
        System.out.println(fix);
    }
}

