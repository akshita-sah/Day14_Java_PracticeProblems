import java.util.Scanner;

public class Q10_GuessNumber {
    /**
     * Guesses the number using binary search after asking range from the user.
     * @param n
     * @return
     */
    public static int guessNumber(int n)
    {
        Scanner sc = new Scanner(System.in);
        int low = 0,high=n-1,mid,choice;
        while(low<high)
        {
            mid = (high+low)/2;
            System.out.println("Enter 1 if number is between "+low+" and "+mid+", Enter 2 if number is between :"
                    +(mid+1)+" and "+high);
            choice = sc.nextInt();
            if(choice==1)
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args)
    {
        int n = 128;
        System.out.println("The guessed number is: "+guessNumber(n));
    }
}
