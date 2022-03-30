package Command_line_arguments;

public class CLA {
     public static void main(String[] args) {
       int s = 2+2+7+9;
        for (int i=0;i<args.length;++i)

//            System.out.println(args[i]);

            s = s+Integer.parseInt(args[i]);

        System.out.println("Sum is " + s);
        }
    }

