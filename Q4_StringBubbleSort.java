import java.util.ArrayList;

public class Q4_StringBubbleSort {
    /**
     * Sorting using Bubble Sort Algorithm in multiple passes by comparing every element to next element.
     * @param wordList
     */
    public static void bubbleSort(ArrayList<String>wordList)
    {
        int i, j;
        int n = wordList.size();
        String temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (wordList.get(j).compareTo(wordList.get(j+1))>0) {
                    temp = wordList.get(j);
                    wordList.set(j,wordList.get(j+1));
                    wordList.set(j+1,temp);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("string");
        wordList.add("binary");
        wordList.add("zzz");
        wordList.add("java");
        bubbleSort(wordList);
        System.out.println(wordList);
    }
}
