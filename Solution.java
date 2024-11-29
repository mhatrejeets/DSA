class Solution {
    public static int removeElement(int[] nums, int val) {
        int i=0, k=0;
        for(;i<nums.length;i++){
            if(val != nums[i]){
                k=k+1;
            }
            
        }
        return k;
    }

    public static void main(String args[]){
        int nums[] = {3,2,2,3};
        int val =3;
        
        System.out.println(removeElement(nums,val));
    }
}