package javamethod;

public class MethodOverLoading {
    private static void display(int a) {
        System.out.println("Arguments : "+a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments : " + a + "and" + b);
    }

    public static void main(String[] args) {
        display(2);
        display(3, 4);
    }
}


class HelperService{
    private String formateNumber(int value){
        return String.format("%d", value);
    }

    private String formatNumber(double value){
        return String.format("%.3f", value);
    }

    private String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        HelperService hs = new HelperService();
        System.out.println(hs.formateNumber(500));
        System.out.println(hs.formatNumber(89.9994));
        System.out.println(hs.formatNumber("500"));
    }
}