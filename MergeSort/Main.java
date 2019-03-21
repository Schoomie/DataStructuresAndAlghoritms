package MergeSort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kuba on 14/03/2019.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your text, type done for exit:");
        String strin = sc.nextLine();

        while(!strin.equals("done")) {
            input.add(strin);
            strin = sc.nextLine();
        }
        System.out.println("************************");
        MergeSort test = new MergeSort(input);
        test.sort();
        test.show();
    }
}




