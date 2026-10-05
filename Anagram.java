package Task;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = sc.nextLine();

        System.out.println("Enter second word:");
        String word2 = sc.nextLine();

        if (word1.length() != word2.length()) {
            System.out.println("It is not an Anagram");
        } 
        else {
            char[] a = word1.toCharArray();
            char[] b = word2.toCharArray();

            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);

            if (java.util.Arrays.equals(a, b)) {
                System.out.println("It is an Anagram");
            } 
            else {
                System.out.println("It is not an Anagram");
            }
        }
    }
}