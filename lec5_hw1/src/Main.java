import java.util.Scanner;

/*
Ask user to enter the number of month.
Read the value and write the amount of days in this month (create array with amount days of each month).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of month");
        if(scan.hasNextInt()){
            int mn = scan.nextInt();
                int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
                switch (mn){
                    case 1:
                        System.out.println("Jan "+days[0]);
                        break;
                    case 2:
                        System.out.println("Feb "+days[1]);
                        break;
                    case 3:
                        System.out.println("Mar "+days[2]);
                        break;
                    case 4:
                        System.out.println("Apr "+days[3]);
                        break;
                    case 5:
                        System.out.println("May "+days[4]);
                        break;
                    case 6:
                        System.out.println("Jun "+days[5]);
                        break;
                    case 7:
                        System.out.println("Jul "+days[6]);
                        break;
                    case 8:
                        System.out.println("Aug "+days[7]);
                        break;
                    case 9:
                        System.out.println("Sep "+days[8]);
                        break;
                    case 10:
                        System.out.println("Oct "+days[9]);
                        break;
                    case 11:
                        System.out.println("Nov "+days[10]);
                        break;
                    case 12:
                        System.out.println("Dec "+days[11]);
                        break;
                    default: System.out.println("no such month");
                        break;
                }
        }else System.out.println("wrong input");
    }
}
