import java.util.Scanner;
public class AnglesOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle 1:");
        int a1 = sc.nextInt();
        System.out.println("Enter angle 2:");
        int a2 = sc.nextInt();
        int a3 = 180 - (a1+a2);
        System.out.println("Third angle is: " + a3);
    }
}
