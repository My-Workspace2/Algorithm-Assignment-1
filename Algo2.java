public class Algo2 {


    public static void main(String[] args) {



    int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};


    int min_num=0;
    int max_num=0;

    for (int i=0;i<nums.length;i++)
    {
       if(nums[i]>max_num)
       {
            max_num =nums[i] ;
       }

       if(nums[i]<min_num)
       {
            min_num =nums[i] ;
       }
    }

    System.out.printf("min number is %s and max number is %s\n ",min_num,max_num);


    }
    
}
