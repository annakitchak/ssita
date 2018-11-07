import java.util.Scanner;

/*
Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive
or product of last 5 element in the other case.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 10 numbers");
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0, a10 = 0;
        if (scan.hasNextInt()) {
            a1 = scan.nextInt();
            a2 = scan.nextInt();
            a3 = scan.nextInt();
            a4 = scan.nextInt();
            a5 = scan.nextInt();
            a6 = scan.nextInt();
            a7 = scan.nextInt();
            a8 = scan.nextInt();
            a9 = scan.nextInt();
            a10 = scan.nextInt();
        }

        int[] nums = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
        int sum = 0;
        int pr=1;
        if (nums[0] > 0 && nums[1]>0 && nums[2]>0 && nums[3]>0 && nums[4]>0) {
            for (int i = 0; i < 5; i++) {
                sum = sum + nums[i];
            }
        }
        for (int i = 5; i < nums.length; i++) {
            pr = pr*nums[i];
        }
        if(sum>0) {
            System.out.println(sum);
        }else System.out.println(pr);
    }
}
