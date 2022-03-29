package Static_members;

public class Static {

    int x; //Instance variable
    private static int y; //Static member variable

    public void fun1() { } //instance member function
    public static void fun2() { y=5; } //static member function

    static class Test{
        public static String country = "INDIA";
        public static String city = "Bag";
    }
}
class Hello {
    public static void main(String[] args) {
        Static.fun2();
        System.out.println("The country is " + Static.Test.country);
        System.out.println("The city is " + Static.Test.city);

    }
}

