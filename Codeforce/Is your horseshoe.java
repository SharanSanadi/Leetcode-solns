import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use a Set to store unique colors
        Set<Integer> colors = new HashSet<>();

        // Read 4 integers
        for (int i = 0; i < 4; i++) {
            colors.add(sc.nextInt());
        }

        // Total horseshoes = 4
        // Replacements needed = 4 - unique colors
        System.out.println(4 - colors.size());
    }
}
