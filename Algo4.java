public class Algo4 {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50}; 

        int j=nums.length-1 ;

        int p =0;
        if(nums.length%2==0)
        {
           p=1 ;
        }

        for (int i=0;i<nums.length/2-p; i++)
        {
             int k=0;

            k =nums[i] ;
            nums[i] = nums[j] ;
            nums[j]=k ;
            j--;
            

        }

        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }

    }
    
}
