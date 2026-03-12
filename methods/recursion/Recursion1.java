public class Recursion1{
    static int add(int x, int y){
        if (y<x){
            return 0;
        }
        int ans = y + add(x, y-1);
        return ans;
    }


    public static void main(String[] args){
        int result=add(3,10);
        System.out.println(result);
    }
}