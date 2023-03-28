public class bitManipulation {
    public static void main(String[] args) {
        int num = 10; // 1010 Bit count of a num from 1 to n
        int pos = 1; // Calculate right to left bit from 0 to n
        int bitMask = 1 << pos;

        // Get bit
        if ((bitMask & num) == 0) {
            System.out.println("Get Bit is 0");
        } else {
            System.out.println("Get Bit is 1");
        }
        System.out.println("Deciaml Value of Get bit is " + (bitMask & num));

        // Set bit
        if ((bitMask | num) == 0) {
            System.out.println("Set Bit is 0");
        } else {
            System.out.println("Set Bit is 1");
        }
        System.out.println("Deciaml Value of Set bit is " + (bitMask | num));

        // Clear bit
        System.out.println("Deciaml Value of Clear bit is " + (~(bitMask) & num));

        System.out.println(); // for one line of space in output

        // Update bit
        if ((bitMask & num) == 0) {
            System.out.println(bitMask | num);
        } else {
            System.out.println(~(bitMask) & num);
        }
    }
}