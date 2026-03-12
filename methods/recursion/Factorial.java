public class Factorial{
    static int fact(int n){
        if( n==0 || n==1){
        return 1;
        }
        int ans= n*fact(n-1);
        return ans;
    }
    public static void main(String[] args){
        int ans = fact(5);
        System.out.println(ans);
    }
}



// w3shools
// public class Main {
//   static int factorial(int n) {
//     if (n > 1) {
//       return n * factorial(n - 1);
//     } else {
//       return 1;
//     }
//   }

//   public static void main(String[] args) {
//     System.out.println("Factorial of 5 is " + factorial(5));
//   }
// }