import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String result = ((ch >= 'a' && ch <= 'z')
                || (ch >= 'A' && ch <= 'Z')) ? "Alphabet" :
                "Not an Alphabet";
        boolean status = (2>3) ? false : true;
        System.out.println(result);
    }
}
