import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int A = sc.nextInt();
        System.out.println("Enter value of B:");
        int B = sc.nextInt();
        System.out.println("Enter value of C:");
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("Average is:" + average);
    }
}
