/*

* * * * *
 * * * *
  * * *
   * *
    *

*/


import java.util.*;
class program7{
    public static void main(String arg[]){
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        pattern(n);
    }

    public static void pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }

            for(int k = i;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}