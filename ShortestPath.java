public class ShortestPath {
     static float findShortestPath(String str){
        int x = 0, y= 0;
        for(int i = 0 ; i < str.length() ; i++){
            char dir = str.charAt(i);

            if (dir == 'n') y++;
            else if (dir == 's') y--;
            else if(dir == 'e') x++;
            else if(dir == 'w') x--;
            else return 0.0f;
        }

        int X = x*x;
        int Y = y*y;

        return  (float)Math.sqrt(X+Y);
        
     }

    public static void main(String[] args) {
        String str = "wneenesennn";
        float res = findShortestPath(str);
        System.out.println(res);
    }
}
