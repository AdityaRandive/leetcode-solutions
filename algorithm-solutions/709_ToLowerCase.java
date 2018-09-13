class Solution {
    public String toLowerCase(String str) {
        
        int i = 0;
        int ascii = 0;
        char temp;
        char temp2;
        int len = str.length();
        StringBuilder str2 = new StringBuilder(str);
                
        for(i=0;i<len;i++)
        {
            temp = str2.charAt(i);
            ascii = (int) temp;
            
            if(ascii>=65 && ascii <=90)
            {
                ascii = ascii + 32;
                temp2 = (char) ascii;
                str2.setCharAt(i, temp2);
            }
        }
        
        str = str2.toString();
        
        return str;
    }
}