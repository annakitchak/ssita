import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Solve the next tasks:
    read 3 float numbers and check: are they all belong to the range [-5,5];
    read 3 integer numbers and write max and min of them;
    read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float a,b,c;
        System.out.println("enter 3 float numbers");
        a = Float.parseFloat(br.readLine());
        b = Float.parseFloat(br.readLine());
        c = Float.parseFloat(br.readLine());
        if((a>=-5) && (a<=5) && (b>=-5) && (b<=5) && (c>=-5) && (c<=5)){
            System.out.println("they all belong to the range [-5,5]");
        }
        else System.out.println("not all of them belong to the range [-5,5]");



    }
}
