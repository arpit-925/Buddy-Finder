import java.util.ArrayList;
import java.util.Scanner;
 class A_Line_Breaks{
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int size =0;
        int count =0;
       ArrayList<Integer> list = new ArrayList<>(); 
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m= sc.nextInt();
          //  String a = new String[n];
            for(int j=0;j<n;j++)
            {  String a = sc.nextLine();
              //  System.out.println(a[j]);
              if (size + a.length() <= m) {
                    size += a.length();
                    count++;
                } else {
                    break;
            }
        }
   list.add(count);}
           for(int ans : list)
            System.out.println(ans);
        }

    }
