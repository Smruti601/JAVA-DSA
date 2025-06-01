class String_Compression{

    public static StringBuilder compress(StringBuilder str)
    {
        if(str.length() == 0 && str == null){
            return new StringBuilder("NO Value");
        }


            StringBuilder newStr = new StringBuilder("");
            Integer count = 1;

            for(int i = 1 ; i < str.length() ; i++){
                if(str.charAt(i) == str.charAt(i-1)){
                    count++;
                }
                else{
                    newStr.append(str.charAt(i-1));
                    newStr.append(count);
                    count = 1;
                }
            }

            newStr.append(str.charAt(str.length()-1));
            newStr.append(count);
           
        

        return newStr;
    }
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaavvvccc");
        StringBuilder result = compress(str);
        System.out.println(result);
    }
}