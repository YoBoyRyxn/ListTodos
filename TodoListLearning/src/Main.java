import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> d = new ArrayList<>();
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        if (args.length == 0) {

            System.out.println("Enter Todo One: ");
            String todoOne = s.nextLine();
            d.add(todoOne);
            System.out.println("Enter Todo Two: ");
            String todoTwo = s.nextLine();
            d.add(todoTwo);

            System.out.println("Todo One: " + d.getFirst());
            System.out.println("Todo Two: " + d.getLast());



        }

    }
}