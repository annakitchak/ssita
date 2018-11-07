
//Enter the number of the day of the week. Display the name in three languages.


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week:");
        if(scan.hasNextInt()){
            int day = scan.nextInt();
            switch (day){
                case 1:
                    System.out.println("Sunday, Неділя, Воскресенье");
                    break;
                case 2:
                    System.out.println("Monday, Понеділок, Понедельник");
                    break;
                case 3:
                    System.out.println("Tuesday, Вівторок, Вторник");
                    break;
                case 4:
                    System.out.println("Wednesday, Середа, Среда");
                    break;
                case 5:
                    System.out.println("Thursday, Четвер, Четверг");
                    break;
                case 6:
                    System.out.println("Friday, П’ятниця, Пятница");
                    break;
                case 7:
                    System.out.println("Saturday, Субота, Суббота");
                    break;
                default:
                    System.out.println("wrong input");
            }
        }
        else System.out.println("wrong input");
    }
}
