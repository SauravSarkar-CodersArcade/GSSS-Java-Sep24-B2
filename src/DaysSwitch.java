import java.util.Scanner;
public class DaysSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = sc.next();
        switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> System.out.println(day + " is Weekday..!!");
            case "SAT", "SUN" -> System.out.println(day + " is an Weekend..!!");
            default -> System.out.println(day + " is Invalid Data:");
        }
    }
}
