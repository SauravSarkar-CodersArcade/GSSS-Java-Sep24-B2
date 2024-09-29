import java.util.Scanner;
public class DaysSwitchYieldKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = sc.nextLine();
        String typeOfDay = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday..!!";
            case "SAT", "SUN" -> "Weekend..!!";
            default -> {
                if (day.isEmpty()) {
                    yield "Sorry! No Data Given!";
                } else {
                    yield "Invalid data!";
                }
            }
        };
        System.out.println("The type of day is: " + typeOfDay);
    }
}