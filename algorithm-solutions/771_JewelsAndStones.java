class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int i = 0;
        int no_of_jewels = J.length();
        int no_of_stones = S.length();
        
        int result = 0;
        
        for(i=0;i<no_of_stones;i++)
        {
            if(J.contains(Character.toString(S.charAt(i))))
            {
                result = result + 1;
            }
        }
        
        return result;        
        
    }
}