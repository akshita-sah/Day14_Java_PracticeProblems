public class Q8_PrimeAnagramPalindrome {
    /**
     * Find numbers that are prime, by checking if it is divisible by any number other than 1 or number.
     * @param num
     * @return
     */
    public static boolean findPrimeNumbers(int num)
    {
        if(num == 0 || num == 1)
            return false;
        for(int i=2;i<num;i++)
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }

    /**
     * Checking palindrome by converting number to string and comparing with reverse.
     * @param num
     * @return
     */
    public static boolean AnagramPalindrome(int num)
    {
        String n1 = Integer.toString(num);
        StringBuilder n2 = new StringBuilder();
        n2.append(n1);
        n2.reverse();
        if(n1.compareTo(String.valueOf(n2))==0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args)
    {
        for(int i=0;i<1000;i++)
        {
            if(findPrimeNumbers(i) && AnagramPalindrome(i))
                System.out.println(i);
        }
    }
}
