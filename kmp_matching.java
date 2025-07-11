// User function Template for Java
import java.util.ArrayList;
class Solution {
    static void createLPS(String pat , int[]lps){
        int len = 0 ;
        lps[0] = 0 ;
        
        int i = 1 ;
        while(i < pat.length()){
            if(pat.charAt(i) == pat.charAt(len)){
                len++ ; lps[i] = len; i++;
            }
            else{
                if(len != 0) len = lps[len-1];
                else{ lps[i] = 0 ; i++;}
            }
        }
    }

    static  ArrayList<Integer> search(String pat, String txt) {
       int n = txt.length();
       int m = pat.length();
       
       int [] lps = new int[m];
       ArrayList<Integer> res = new ArrayList<>();
       
       createLPS(pat,lps);
       
       int i = 0 ; int j = 0 ;
       
       while(i < n){
           if(txt.charAt(i) == pat.charAt(j)){
               i++;j++;
               if(j == m){
                   res.add(i-j);
                   j = lps[j-1];
               }
           }
           else{
               if(j!=0) j = lps[j-1];
               else i++;
           }
       }
       
       return res;
        
    }
    
    public static void main(String []Args){
        String txt = "abababcababc";
        String pat = "ababc";
        
        ArrayList<Integer> res = search(txt, pat);
        for(int n :res){
            System.out.print(n + " ");
        }
        
    }
        
    
}