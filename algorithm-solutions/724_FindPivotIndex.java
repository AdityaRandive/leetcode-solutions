class 724_FindPivotIndex 
{
    public int pivotIndex(int[] nums) 
    {        
        int allsum = 0;
        int currsum = 0;
        int i = 0;
        int nlen = nums.length;
        
        for(i=0;i<nlen;i++)
        {
            allsum = allsum + nums[i];
        }
        
        for(i=0;i<nlen;currsum = currsum + nums[i++])
        {   
            if((currsum + currsum) == (allsum - nums[i]))
            {
                return i;
            }
        }
        
        return -1;
    }
}
