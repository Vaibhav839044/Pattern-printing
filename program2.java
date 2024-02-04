/*

*
* *
* * *
* * * *
*/

import java.util.*;
class program2{
    public static void main(String arg[]){
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        pattern1(n);
    }

    public static void pattern1(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}