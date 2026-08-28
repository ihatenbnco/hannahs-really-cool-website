import java.util.Scanner;

//It's a calculating calculator.//
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator: Java and bad edition.");
        System.out.println(""); //Turn's out there's a better way to do line breaks >:(. Also when I do '>:(' VScodium likes adding in ')', trying to automplete it. Maybe I should learn Emacs. //

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number you wish to add? ");
        double numberOne = scanner.nextDouble();

        System.out.print("What is the second number you want to add? ");
        double numberTwo = scanner.nextDouble(); //I hate: Windows, NBNco, Cloudflare, NBNco, Discord, NBNco, ICANN, NBNco, ICANN, ICANN, NBNco, Google, Foxconn, the letter 'A', Windows, NBNco, NBNco, and FUCKING NBNCO//

        double result = numberOne + numberTwo;
        System.out.println("The Java calculator has calculated your answer to be: " + result);

        scanner.close();
// This is a comment, designed to provide commentry on the code, however this comment is entirely pointless and useless, there is no reason why this comment should be in here. //
    }
}