import java.util.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Valid {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a;
        int b;
        while (true) {
            System.out.println("Enter value of a");

            if (Scanner.hasNextInt()) {
                a = Scanner.nextInt();
                break;
           }   else {
            System.out.println("The entered value is not an integer. Please enter an integer");
            Scanner.next();
           }
        }   
        while (true) {
            System.out.println("Enter Value of b");
            
            if (Scanner.hasNextInt()) {
                b = Scanner.nextInt();
                break;
           }   else {
            System.out.println("The entered value is not an integer. Please enter an integer");
            Scanner.next();
           }
            
        } 
        System.out.println("If you want a sum then press + and if you want to perform subtraction then press -");
        String op = Scanner.next();
        if (op.equals("+")) {
            System.out.print("The Sum is ");
            System.out.println(a+b);
        }
        else if (op.equals("-")) {
            System.out.print("The difference is ");
            System.out.println(a - b);
        } else {
            System.out.println("Invalid operation");
        }
    
    }
}