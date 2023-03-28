public class Loops {
    public static void main(String[] args) {
        System.out.println("All Loops Concept");

        for (int i = 0; i < 11; i++) {
        System.out.print(i + " ");
        }
        System.out.println(" ");

        int i;
        i = 0;
        while (i < 11) {
        System.out.print(i + " ");
        i++;
        }
        System.out.println(" ");
        System.out.println(i);
        i = 0;
        do {
        System.out.print(i + " ");
        i++;
        } while (i < 11);
        System.out.println(" ");
        System.out.println(i);
        
    }
}
