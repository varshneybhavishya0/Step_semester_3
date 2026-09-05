package Week_1;

import java.util.Scanner;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {

        char[] arr = customerName.toCharArray();

        String reversed = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed = reversed + arr[i];
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner bc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = bc.nextLine();

        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);

        bc.close();
    }
}