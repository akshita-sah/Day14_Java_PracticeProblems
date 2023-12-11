import java.util.ArrayList;

public class Q5_MergeSort {
    /**
     * Recursive function to divide the array based on the mid of length of the list.
     * @param wordList
     * @param start
     * @param end
     */
    public static void mergeSort(ArrayList<String> wordList,int start, int end) {
        if (start < end && (end - start) >= 1) {
            int mid = (end + start) / 2;
            mergeSort(wordList,start, mid);
            mergeSort(wordList,mid + 1, end);
            mergeArrayElements(wordList,start,mid,end);
        }
    }

    /*
    Merge arrays by comparing them using compareTo() to merge them in sorted order. Add left out strings.
     */
    public static void mergeArrayElements(ArrayList<String>wordList,int start, int mid, int end) {
        ArrayList<String> tempArray = new ArrayList<>();
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            if (wordList.get(left).compareTo(wordList.get(right))<=0) {
                tempArray.add(wordList.get(left));
                left++;
            } else {
                tempArray.add(wordList.get(right));
                right++;
            }
        }
        while (left <= mid) {
            tempArray.add(wordList.get(left));
            left++;
        }
        while (right <= end) {
            tempArray.add(wordList.get(right));
            right++;
        }
        for (int i = 0; i < tempArray.size(); start++) {
            wordList.set(start, tempArray.get(i++));
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("string");
        wordList.add("binary");
        wordList.add("zzz");
        wordList.add("java");
        mergeSort(wordList,0,wordList.size()-1);
        System.out.println(wordList);
    }
}
