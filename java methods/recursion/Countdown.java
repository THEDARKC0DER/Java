public class Countdown{
    static void count(int x){
        if (x==0){
            return ;
        }
        count(x-1);
        System.out.println(x);
      
    }
    public static void main(String[] args){
        count(60);
      
    }
}



// w3schools
// public class Main {
//   static void countdown(int n) {
//     if (n > 0) {
//       System.out.print(n + " ");
//       countdown(n - 1);
//     }
//   }

//   public static void main(String[] args) {
//     countdown(5);
//   }
// }