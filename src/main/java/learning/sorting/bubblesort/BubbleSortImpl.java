package learning.sorting.bubblesort;

public class BubbleSortImpl {
    private static int[] arrayOfInt = {1,2,4,6,8,10,12,15,28,34};
    private int calledTimes = 0;
    private void bubbleSortArray(int[] arrayToBeSorted, int length){
        boolean interchanged = false;
        calledTimes ++;
        for(int i=1; i<arrayToBeSorted.length;i++){
            int firstElement = arrayToBeSorted[i-1];
            int secondElement = arrayToBeSorted[i];
            if(firstElement > secondElement){
                arrayToBeSorted[i] = firstElement;
                arrayToBeSorted[i-1] = secondElement;
                interchanged = true;
            }
        }
        for (int a : arrayToBeSorted)
            System.out.print(a + " ");
        System.out.println("");
        if(interchanged)
            bubbleSortArray(arrayOfInt,arrayOfInt.length-calledTimes);

    }
    public static void main(String[] args){
        BubbleSortImpl bubbleSort = new BubbleSortImpl();
        bubbleSort.bubbleSortArray(arrayOfInt,arrayOfInt.length);
    }
}
