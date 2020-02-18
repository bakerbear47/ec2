import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(args[0]);
        try {
            int num = Integer.parseInt(args[0]);


            for (int i = 1; i <= 10; i++) {
                int result = i * num;
                System.out.println(num + "x" + i + "=" + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("inputblablabla");
        }


        //Scanner scanner = new Scanner(System.in);


    }
}
