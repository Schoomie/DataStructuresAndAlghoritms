package MergeSort;


import java.util.ArrayList;
import java.util.List;

public class CreateTable {
    private int size;
List<Integer> a;
    public CreateTable(int size) {
        this.size = size;
        a= new ArrayList<>();
    }
public List<Integer> inputList(){

    for(int i=0;i<this.size;i++){
        a.add((int)(Math.random()*200)-100);
    }

    return a;
}
    public void printList(){
        for(int i=0;i<this.size;i++){
            System.out.print(a.get(i)+" ");
        }
    }

}

