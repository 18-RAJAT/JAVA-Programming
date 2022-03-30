package Import_Java;

public class import_java {
    public static void main(String[] args)
    {
        student s1 = new student();
        s1.setRollno(100);
        s1.setName("Rajat Joshi");

        System.out.println("Roll no -> " + s1.getRollno());
        System.out.println("Name -> " + s1.getName());
    }
}
