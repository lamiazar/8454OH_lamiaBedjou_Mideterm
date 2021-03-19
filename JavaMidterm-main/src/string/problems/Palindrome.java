package string.problems;

public class Palindrome {
    public static boolean checkIfpalindrom(char[] word){
        int i = 0;
        int j = word.length - 1;
        while (j > i) {
            if (word[i] != word[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String ss="dad";
        System.out.println(checkIfpalindrom(ss.toCharArray()));
        }
    }

