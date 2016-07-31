import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Coded as a part of a summer contest hosted by Virginia Tech's programming team.
 * Problem link:  https://pcs.spruett.me/contests/3/problems
 *
 * @author Alyssa Herbst
 * 7/31/16
 */
public class MajorOrMinor {
    public static void main(String[] args)
    {
        List<List<String>> notes = new ArrayList<>();
        notes.add(Arrays.asList("C", "B#"));
        notes.add(Arrays.asList("C#", "Db"));
        notes.add(Arrays.asList("D"));
        notes.add(Arrays.asList("D#", "Eb"));
        notes.add(Arrays.asList("E", "Fb"));
        notes.add(Arrays.asList("F", "E#"));
        notes.add(Arrays.asList("F#", "Gb"));
        notes.add(Arrays.asList("G"));
        notes.add(Arrays.asList("G#", "Ab"));
        notes.add(Arrays.asList("A"));
        notes.add(Arrays.asList("A#", "Bb"));
        notes.add(Arrays.asList("B", "Cb"));
        Scanner sc = new Scanner(System.in);
        String root = sc.next();
        String third = sc.next();
        int idx = 0;
        while(!(notes.get(idx).contains(root))){
            idx++;
        }
        if(notes.get((idx + 3)%12).contains(third)){
            System.out.print("minor");
        }else {
            System.out.print("major");
        }
    }
}
