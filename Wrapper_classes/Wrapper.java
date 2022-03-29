package Wrapper_classes;

public class Wrapper {

    public static void main(String[] args)
    {
        Integer i1 = Integer.valueOf("101",3);

        Double d1 = Double.valueOf("3.14");

       int a =  Integer.parseInt("123"); //As integer conversion

       double b  = Double.parseDouble("13.33"); //String to double conversion

       int c = i1.intValue(); //int to ordinary int value to move
        System.out.println("Value of c is " + c);
        System.out.println("Value of a is " +a);
    }

}
