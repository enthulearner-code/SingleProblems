package learning.sorting.selectionsort;

public class SelectionSort {
    private int[] arrayInt = {12,45,12,3,67,5,1,9};
    private void SelectionSortImpl(){
        for(int i=0;i<arrayInt.length;i++){
            int smallestIndex = i;
            for(int j=i;j<arrayInt.length-1;j++){
                if(arrayInt[j+1] < arrayInt[smallestIndex]){
                    smallestIndex = j+1;
                }
            }
            if(smallestIndex != i){
                int temp = arrayInt[smallestIndex];
                arrayInt[smallestIndex] = arrayInt[i];
                arrayInt[i] = temp;
            }
        }
        for(int a : arrayInt){
            System.out.print(a + ",");
        }
    }
    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.SelectionSortImpl();
    }
}
