class Solution {
    public int hammingDistance(int x, int y) {
        
        int i = 0;
        int x2 = x;
        int y2 = y;
        int a = 0;
        int distance = 0;
        int bin_x_len = 0;
        int bin_y_len = 0;
        String bin_x = "";
        String bin_y = "";
        
        //Get the Binary for x
        bin_x = String.format("%32s", Integer.toBinaryString(x2)).replace(' ', '0');
        
        //Get Binary for y
        bin_y = String.format("%32s", Integer.toBinaryString(y2)).replace(' ', '0');
            
        bin_x_len = bin_x.length();
        bin_y_len = bin_y.length();        
       
        while(bin_x_len!=0 || bin_y_len!=0)
        {           
            if(bin_x.charAt(i) != bin_y.charAt(i))
            {
                distance = distance + 1;
            }
            i = i + 1;
            bin_x_len = bin_x_len - 1;
            bin_y_len = bin_y_len - 1;
        }
        
        if(bin_x_len == 0 && bin_y_len!=0)
        {
            distance = distance + bin_y_len;
        }        
        else if(bin_y_len == 0 && bin_x_len!=0)
        {
            distance = distance + bin_x_len;
        }
        
        return distance;
    }
}