
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        //Enter three numbers. Find out how many of them are odd. (непарні)
        int a = 0, b = 0, c = 0;
        int count = 0;
            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter first number:");
                if (scan.hasNextInt()) {
                    a = scan.nextInt();
                    if ((a % 2) != 0) {
                        count = count + 1;
                    }
                } else {
                    System.out.println("wrong input");
                    break;
                }
                System.out.println("Enter second number:");
                if (scan.hasNextInt()) {
                    b = scan.nextInt();
                    if ((b % 2) != 0) {
                        count = count + 1;
                    }
                } else {
                    System.out.println("wrong input");
                    break;
                }
                System.out.println("Enter third number:");
                if (scan.hasNextInt()) {
                    c = scan.nextInt();
                    if ((c % 2) != 0) {
                        count = count + 1;
                    }
                    scan.close();
                    break;

                } else {
                    System.out.println("wrong input");
                    break;
                }
            }
        System.out.println(count);
        }


    }

