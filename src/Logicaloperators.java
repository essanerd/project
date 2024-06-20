public class Logicaloperators {
    public static void main(String[] args) {
        int temperature = 22;
        boolean iswarm = temperature > 20 && temperature < 30;
        System.out.println(iswarm);


        int temperature1 = 12;
        boolean iswarm1 = temperature1 > 20 && temperature1 < 30;
        System.out.println(iswarm1);


        boolean hashighincome = true;
        boolean hasgoodcredit=true;
        boolean iseligible = hashighincome || hasgoodcredit;


        boolean hashighincome1 = false;
        boolean hasgoodcredit1=true;
        boolean iseligible1 = hashighincome1 || hasgoodcredit1;


        boolean hashighincome0 = false;
        boolean hasgoodcredit0=true;
        boolean hascriminalrecord = false;
        boolean iseligible2 = (hashighincome0 || hasgoodcredit0)&& hascriminalrecord;
        System.out.println(iseligible2);
    }
}
