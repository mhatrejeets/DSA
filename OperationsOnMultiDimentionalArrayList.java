import java.util.ArrayList;
public class OperationsOnMultiDimentionalArrayList{
    public static void main(String args []){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList <Integer> list2 = new ArrayList <> ();
        list2.add(55);
        list2.add(66);
        list2.add(77);
        mainList.add(list1);
        mainList.add(list2);
        for(int i = 0;i<mainList.size();i++){
            ArrayList <Integer> curr = mainList.get(i);
            for(int j = 0; j<curr.size();j++){
                System.out.print(curr.get(j)+ " " );
            }
            System.out.println();
        }
        System.out.println(mainList);

    }
}