/*
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

*/


import java.util.*;
class program8{
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
            
            for(int k = i,s=1;k<=n;k++,s++){
                
                System.out.print(s+" ");
               
            }
            System.out.println();
        }
    }
}