import java.util.ArrayList;

public class Q3_StringInsertionSort {
    /**
     * Performing sorting by comparing an element from index i till index 0. Finding the sorted placed of that element.
     * @param wordList
     */
    public static void insertionSort(ArrayList<String>wordList)
    {
        int n = wordList.size();
        for(int i=0;i<n;i++)
        {
            String key = wordList.get(i);
            int j = i-1;
            while (j>=0 && wordList.get(j).compareTo(key)>0)
            {
                wordList.set(j+1,wordList.get(j));
                j = j-1;
            }
            wordList.set(j+1,key);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("string");
        wordList.add("binary");
        wordList.add("zzz");
        wordList.add("java");
        insertionSort(wordList);
        System.out.println(wordList);
    }
}
