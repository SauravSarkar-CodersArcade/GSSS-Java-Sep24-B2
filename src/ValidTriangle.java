import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle 1:");
        int a1 = sc.nextInt();
        System.out.println("Enter angle 2:");
        int a2 = sc.nextInt();
        System.out.println("Enter angle 3:");
        int a3 = sc.nextInt();
        if(a1+a2+a3 == 180){
            System.out.println("Valid Triangle.");
        }else {
            System.out.println("Invalid Triangle.");
        }
    }
}
