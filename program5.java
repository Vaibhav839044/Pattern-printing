/*
    *
   * *
  * * *
 * * * *
* * * * *

*/

import java.util.*;
class program5{
    public static void main(String arg[]){
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        pattern(n);
    }

    public static void pattern(int n){
        for(int i =1;i<=n;i++){
            for(int j = i;j<=n;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}