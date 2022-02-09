package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class T3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        System.out.println(arr);
        deleteUnsuitable(arr);
        System.out.println(arr);
    }

    public static void deleteUnsuitable(ArrayList<Integer> arrayList){
        int size = arrayList.size();
        if(size%2 == 1)
            arrayList.remove(--size);

        for (int i = 0; i < size; i+=2) {
            if(arrayList.get(i) > arrayList.get(i+1)){
                arrayList.set(i,null) ;
                arrayList.set(i+1,null);
            }
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next()==null)
                iterator.remove();
        }
    }
}
