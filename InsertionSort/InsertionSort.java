package InsertionSort;

import java.util.List;


abstract class InsertionSort {


    public static List<Integer> sort(List<Integer> a) {
        int key;
        for (int i = 1; i < a.size(); i++) {
            key = a.get(i);
            int j = i;
            while (j > 0 && a.get(j-1) > key) {
                a.set(j, a.get(j-1));
                j--;
            }
            a.set(j, key);
        }


        return a;
    }
}