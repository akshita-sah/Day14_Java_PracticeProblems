public class Q7_PrimeNumbers {
    /**
     * Given a number we find if it is prime by checking if it is divisible by a number besides 1 or itself.
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
    public static void main(String[] args)
    {
        for(int i=0;i<1000;i++)
        {
            if(findPrimeNumbers(i))
                System.out.println(i);
        }
    }
}
