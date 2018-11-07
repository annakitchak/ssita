
public class Main {
    public static void main(String[] args) {
        int [] arr = {2,6,-1,12,-7,33,8,-11,0,-2};
        int max =0;
        int min =arr[0];
        int sum = 0;
        int amount = 0;

        for(int i =0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("max = "+max);

        for(int i =0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("min = "+min);

        for(int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of positive = "+sum);

        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                amount++;
            }
        }
        System.out.println("Amount of negative = "+amount);
    }
}
