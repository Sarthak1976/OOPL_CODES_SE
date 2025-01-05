import java.util.*;

class Generics {
    // Check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if a value is a palindrome
    public <T> boolean isPalindrome(T value) {
        String str = value.toString();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Count specific elements in a list
    public static <T> void count(String type, ArrayList<T> list) {
        int even = 0, odd = 0, prime = 0, palin = 0;
        Generics gen = new Generics();

        if (type.equals("EVEN")) {
            for (T ele : list) {
                if (ele instanceof Integer && (Integer) ele % 2 == 0) {
                    even++;
                }
            }
            System.out.println("Total Even: " + even);
        }

        if (type.equals("ODD")) {
            for (T ele : list) {
                if (ele instanceof Integer && (Integer) ele % 2 != 0) {
                    odd++;
                }
            }
            System.out.println("Total Odd: " + odd);
        }

        if (type.equals("PRIME")) {
            for (T ele : list) {
                if (ele instanceof Integer && gen.isPrime((Integer) ele)) {
                    prime++;
                }
            }
            System.out.println("Total Prime: " + prime);
        }

        if (type.equals("PALIN")) {
            for (T ele : list) {
                if (gen.isPalindrome(ele)) {
                    palin++;
                }
            }
            System.out.println("Total Palindromes: " + palin);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String ArrayList
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("aba", "bcd", "dsd", "msd"));

        // Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(23, 46, 2, 3, 7, 5, 24, 56));

        // Generics object
        Generics gen = new Generics();

        // Count occurrences
        Generics.count("PALIN", stringList);
        Generics.count("EVEN", intList);
        Generics.count("ODD", intList);
        Generics.count("PRIME", intList);

        sc.close();
    }
}
