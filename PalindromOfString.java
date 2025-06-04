package java_with_DSA;

import java.util.Scanner;

public class PalindromOfString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String n = sc.nextLine();

        if (n.isEmpty()) 
        {
            System.out.println("Invalid input");
        } 
        else 
        {
            String reverse = new StringBuilder(n).reverse().toString();

            if (n.equals(reverse)) 
            {
                System.out.println("String is palindrome");
            }
            else
            {
                System.out.println("String is not palindrome");
            }
        }

        sc.close();
    }
}
