class 1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0;
        int j = 0;
        
        int z = 0;
        int flag = 0;
        
        int[] arr = new int[2];
        
        int len = nums.length;
        
        for(i=0;i<len;i++)
        {
            int n = nums[i];
            //System.out.println();
            for(j=i+1;j<len;j++)
            {
                if((n + nums[j]) == target)
                {
                    flag = 1;
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }            
        }
        
        return arr;
    }
}