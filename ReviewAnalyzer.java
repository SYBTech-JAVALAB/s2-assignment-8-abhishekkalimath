import java.util.Scanner;

public class ReviewAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer review:");
        String review = sc.nextLine();

        // Character count
        int charCount = review.length();

        // Word count
        String[] words = review.trim().split("\\s+");
        int wordCount = words.length;

        // Uppercase / Lowercase
        String upper = review.toUpperCase();
        String lower = review.toLowerCase();

        // Reverse text
        String reversed = new StringBuilder(review).reverse().toString();

        // Palindrome check
        String cleaned = review.replaceAll("\\s+", "").toLowerCase();
        String reverseCleaned = new StringBuilder(cleaned).reverse().toString();
        boolean palindrome = cleaned.equals(reverseCleaned);

        // Output
        System.out.println("\n----- Analysis Result -----");
        System.out.println("Original Review : " + review);
        System.out.println("Word Count      : " + wordCount);
        System.out.println("Character Count : " + charCount);
        System.out.println("Uppercase       : " + upper);
        System.out.println("Lowercase       : " + lower);
        System.out.println("Reversed Text   : " + reversed);
        System.out.println("Palindrome      : " + (palindrome ? "Yes" : "No"));

        sc.close();
    }
}
