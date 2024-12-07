package dailyproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleExistCheck {
    public boolean checkIfExist(int[] arr){
        boolean exist = false;
        int size = arr.length;
        List<Integer> checkArr = new ArrayList<>();
        Arrays.sort(arr);
        for(int i =0; i< size; i++){
            if(arr[i]%2 == 0)
                checkArr.add(arr[i]/2);
            else
                continue;
        }
        for(int i=0;i<checkArr.size();i++){
            boolean secondZero = false;
            for(int j=0;j<size;j++){
                if(arr[j] > checkArr.get(i))
                    break;
                if(checkArr.get(i)==arr[j]){
                    if(arr[j] == 0 && !secondZero) {
                        secondZero = true;
                        continue;
                    }
                    exist = true;
                    break;
                }
            }
            if(exist)
                break;
        }
        return exist;
    }
    public static void main(String[] args){
        DoubleExistCheck doubleExistCheck = new DoubleExistCheck();
        int[] arr= {10,2,5,3};
//        System.out.pr,,intln((7/2));
        System.out.println(doubleExistCheck.checkIfExist(arr));
    }

}
