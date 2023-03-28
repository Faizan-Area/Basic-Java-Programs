// import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        // try(Scanner sc = new Scanner(System.in)){
        // }
        StringBuilder name = new StringBuilder("Tony Stark");
        System.out.println(name.charAt(0));

        name.charAt(1); // No effect it is only use in print statement
        System.out.println(name);

        // Replace a character at index
        name.setCharAt(0, 'J'); // Can be insert in print statement
        System.out.println(name);

        // Add a character at index
        name.insert(4, ','); // Can be insert in print statement
        System.out.println(name);

        // Delete Characters in b/w index
        // Starting 0 -infinite
        // Ending with 0 - infinite (last value n - 1 perform)
        name.delete(1, 3);
        System.out.println(name);

        // Delete a Character at index
        name.deleteCharAt(0);
        System.out.println(name);

        // Best Method to add further strings instead of // name = name + " Whatever "; and this method not applicable in String Builder
        // Concatenation in StringBuilder not supported
        name.append(" "); // name = name + " ";
        name.append("as "); // name = name + "as ";
        name.append("R"); // name = name + "R";
        name.append("D"); // name = name + "D";
        name.append("J"); // name = name + "J";
        System.out.println(name);

        // Reverse a String
        StringBuilder str = new StringBuilder("faizan");
        StringBuilder rev = new StringBuilder(""); // Not Useable in loop
        // String str = "faizan";
        // String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
            // rev = rev + str.charAt(i);
        }
        System.out.println(rev);

    }
}
