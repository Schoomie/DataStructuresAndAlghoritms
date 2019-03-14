package InsertionSort;

public class Main {

    public static void main(String[] args) {

        CreateTable arr = new CreateTable(9);
        arr.inputList();
        System.out.println(arr.a);
        InsertionSort.sort(arr.a); //0=(n^2)
        System.out.println(arr.a);





    }
}
