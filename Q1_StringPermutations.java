import java.util.ArrayList;
import java.util.Collections;

public class Q1_StringPermutations {
    /**
     * Iterative function to find permutations of the string. Takes the string, find factorial of its length.
     * We loop from 0 to n!-1 and find the permutations, by adding remainder and prints it.
     * @param str
     * @param permutationsIterative
     */
    void permuteIterative(String str, ArrayList<String> permutationsIterative)
    {
        int len = str.length();
        int total = factorial(len);
        for (int number = 0; number < total; number++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = number;
            String s = "";
            for (int divisor = len; divisor >= 1; divisor--) {
                int q = temp / divisor;
                int r = temp % divisor;

                s = s + (sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            permutationsIterative.add(s);
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Recursive function which swaps two elements using a loop to find permutations.
     * @param str
     * @param permutationsRecursive
     * @param index
     */
    void permuteRecursive(String str, ArrayList<String> permutationsRecursive,int index)
    {
        if(index == str.length())
        {
            permutationsRecursive.add(str);
            return;
        }
        for(int i=index;i<str.length();i++)
        {
            str = swap(str,i,index);
            permuteRecursive(str,permutationsRecursive,index+1);
            str = swap(str,i,index);
        }
    }

    String swap(String str,int a,int b)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[b];
        charArray[b] = charArray[a];
        charArray[a] =temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        Q1_StringPermutations str = new Q1_StringPermutations();
        ArrayList<String> permutationsRecursive = new ArrayList<>();
        str.permuteRecursive("ABC",permutationsRecursive,0);
        System.out.println(permutationsRecursive);
        ArrayList<String> permutationsIterative = new ArrayList<>();
        str.permuteIterative("ABC",permutationsIterative);
        System.out.println(permutationsIterative);
        Collections.sort(permutationsIterative);
        Collections.sort(permutationsRecursive);
        if(permutationsIterative.equals(permutationsRecursive))
            System.out.println("Same");
        else System.out.println("Not Same");
    }
}
