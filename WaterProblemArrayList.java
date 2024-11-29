import java.util.ArrayList;
public class WaterProblemArrayList{
    public static int  storeWater(ArrayList <Integer> height){
        int maxWater= Integer.MIN_VALUE;
        for(int i =0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int mw= (Integer.min(height.get(i), height.get(j)))* (j-i);
                if(mw > maxWater){
                    maxWater = mw;
                }
            }
        }

        return maxWater;
    }

    public static boolean checkPairSum (ArrayList <Integer> list , int key){
        for(int i =0;i<list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                if(list.get(i) + list.get(j)== key){
                    return true;
                }

                
            }
        }
        return false;
    }

    public static boolean checkPairSumOP(ArrayList<Integer> list , int key){
        int lp = 0;
        int rp = list.size() - 1;
        while(lp != rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == key){
                return true;
            }
            else if(sum < key){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    

    public static int storeWaterOn(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = Integer.MIN_VALUE;
        while(lp<rp){
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            int mw = Integer.min(height.get(lp),height.get(rp))* (rp-lp);
            maxWater = Integer.max(mw , maxWater);
            
        }
        return maxWater;
    }

    public static void main(String args []){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(6);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(7);
        System.out.println(storeWater(list1));
        System.out.println(storeWaterOn(list1));
        System.out.println(checkPairSum(list1, 12));
        System.out.println(checkPairSumOP(list1, 12));

    }
}