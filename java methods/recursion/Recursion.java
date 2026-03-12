// Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
// my version 
public class Recursion{
    static int add(int x){
        if( x== 0){
            return 0;
        }
        int ans = x + add(x-1);
        return ans;
    }
    public static void main(String[] args){
        int ans= add(10);
        System.out.println(ans);
    }
}

// w3schools
// public class Recursion{
//     static int sum(int k){
//         if (k>0){
//             return k+sum(k-1);
//         }else{
//             return 0;
//         }
//     }
//     public static void main(String[] args){
//         int result=sum(10);
//         System.out.println(result);
//     }
// }