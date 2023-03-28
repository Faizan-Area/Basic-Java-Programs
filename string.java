import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();

            // Strings are immutable

            // Concatenation
            // System.out.println(firstName + " " + lastName);
            // System.out.println("Length of full name is " + (firstName +
            // lastName).length());

            for (int i = 0; i < (firstName + lastName).length(); i++) {
                System.out.print((firstName + lastName).charAt(i) + " ");
            }

            // Starting index start from 0 - infinite
            // Ending index end with (n- 1) if (0 - infinite) or 1 - infinite
            String substr = firstName.substring(2, firstName.length());
            System.out.println(substr);
        }

        int a = 34;
        String str = "This is String";
        System.out.println(str.getClass().getSimpleName());// To Check Data type for String
        System.out.println(((Object)a).getClass().getSimpleName()); // To Check Data type for integer

        String name1 = "tony";
        String name2 = "tony";

        // Right Method to Compare two Strings in Java Language
        // 1 s1 > s2 : +ve Value
        // 2 s1 = s2 : 0 Value
        // 3 s1 < s2 : -ve Value
        if (name1.compareTo(name2) == 0) {
            System.out.println("This is right");
        } else {
            System.out.println("This is wrong");
        }

        // Wrong Method to Compare two Strings in Java Language
        // if (name1 == name2) {
        // System.out.println("This is right");
        // } else {
        // System.out.println("This is Wrong");
        // }

        // Generate this is false because of Wrong Method
        // new String(" ") this method to declare a object without varible declaration
        // just like how we use numbers and strings in print statement
        // if (new String("tony") == new String("tony")) {
        // System.out.println("This is right");
        // } else {
        // System.out.println("This is wrong");
        // }

    }
}