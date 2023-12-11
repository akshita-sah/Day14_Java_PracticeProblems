import java.util.Arrays;

public class Q6_AnagramString {
    /*
    To find anagrams, we convert each string to an array of characters. We sort the two arrays and check
    if the two sorted arrays are same.
     */
    public static void findAnagrams(String s1,String s2)
    {
        char a[]  = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!=b.length)
        {
            System.out.println("The strings are not anagrams");
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                System.out.println("The strings are not anagrams");
                return;
            }
        }
        System.out.println("The two strings are anagrams");
    }

    public static void main(String[] args)
    {
        findAnagrams("earth","heart");
    }
}
