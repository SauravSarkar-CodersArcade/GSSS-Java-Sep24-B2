import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MinimumNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:\n");
        int amount = sc.nextInt();

//        int[] notes = {500,100,50,20,10,5,2,1};
        int[] notes = {100,500,10,20,5,2,1};
        Arrays.sort(notes);
        Collections.reverse(Arrays.asList(notes));
        System.out.println(Arrays.toString(notes));
        int noteCount;
        for (int i=0; i<notes.length; i++){
            if(amount >= notes[i]){
                noteCount = amount / notes[i];
                amount = amount % notes[i];
                System.out.println(notes[i] + " Rs. notes: " + noteCount);
            }
        }
    }
}
