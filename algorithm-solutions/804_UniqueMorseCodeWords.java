class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int number_of_strings = words.length;
        int i = 0;
        int j = 0;
        int ascii = 0;
        int curr_len = 0;
        int index = 0;
        char temp_char = '\0';
        String current_string = "";        
        //ArrayList<String> list = new ArrayList<String>();
        HashSet list = new HashSet();
        
        for(i=0;i<number_of_strings;i++)
        {
            StringBuilder sb = new StringBuilder();
            current_string = words[i];
            curr_len = current_string.length();
            
            for(j=0;j<curr_len;j++)
            {
                temp_char = current_string.charAt(j);
                ascii = (int) temp_char;
                index = ascii - 97;
                
                sb.append(codes[index]);
            }
            list.add(sb.toString());            
        }
        System.out.println(list);
        
        return list.size();
    }
}