import java.util.Scanner;

class Assignment3 {
    public static boolean isPalindrome(String str) {
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str1.length() - 1;

        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The input string is a plindrome.");
        } else {
            System.out.println("The input stirng is not a palindrome");
        }

        sc.close();
    }

}
