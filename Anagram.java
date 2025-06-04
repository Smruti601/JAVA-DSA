class Solution {
   
        static final int MAX_CHAR = 26;
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int [] freq = new int[MAX_CHAR];
        
        for(int i = 0 ; i< s1.length() ; i++){
            freq[s1.charAt(i) - 'a']++;
        }
         for(int i = 0 ; i< s2.length() ; i++){
            freq[s2.charAt(i) - 'a']--;
        }
        
        for(int count : freq)
        {
            if(count != 0)
            return false;
        }
        return true;
    }
    
    public static void main(String [] args){
        String s1 = "HAPPI";
        String s2 = "IPPAH";
        Boolean res = areAnagrams(s1, s2);
        System.out.println(res);
    }
}