public class Algo3 {



    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50}; 

        int[] reverseArray =new int[nums.length];

        int k=0;
        for (int i=nums.length-1;i>-1;i--)
        {
             reverseArray[k] =nums[i];
             k++ ;
        }

        nums =reverseArray ;

         for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }



    }
    
}
