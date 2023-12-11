import java.util.ArrayList;
import java.util.Collections;

public class Q2_BinarySearchString {
    /*
    We keep the start at 0 and end = size of the sorted arraylist. We calculate mid each time.
    If the word is found we return true, if word > word at mid we change the start to mid+1,
    else end = mid-1.
     */
    public static boolean binarySearch(ArrayList<String> wordList, String searchWord)
    {
        int start = 0;
        int end = wordList.size()-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(searchWord.compareTo(wordList.get(mid))==0) {
                System.out.println("Word is found");
                return true;
            }
            else if(searchWord.compareTo(wordList.get(mid))>0)
            {
                start = mid+1;
            }
            else end = mid-1;
        }
        System.out.println("Word not found");
        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("string");
        wordList.add("binary");
        wordList.add("search");
        wordList.add("java");
        Collections.sort(wordList);
        System.out.println(wordList);
        binarySearch(wordList,"string");
    }
}
