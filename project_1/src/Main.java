import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        File input=new File("INPUT.TXT");
        File output=new File("OUTPUT.TXT");
        Scanner sc=new Scanner(input);
        PrintStream pr=new PrintStream(output);
        //String s=sc.next();
//        String s2=s.substring(1);
//        int int2=Integer.parseInt(s2);
//        char ch1=s.charAt(0);
//        char[] ch={'A','B','C','D','E','F','G','H'};
//        for (int i = 0; i <8 ; i++) {
//            if(ch[i]==ch1){
//                if((int2%2==0&&i%2==0)||(int2%2!=0&&i%2!=0))pr.print("WHITE");
//                else {
//                    pr.print("BLACK");
//                }
//                break;
//            }
//        }
        String s=sc.next();
        int[]th={1,0,0};
        for (int i = 0; i <s.length() ; i++) {
            int buf;
            char ch = s.charAt(i);
            switch (ch) {
                case 'A':
                    buf =th[0];
                    th[0] = th[1];
                    th[1] = buf;
                    break;
                case 'B':
                    buf = th[1];
                    th[1] = th[2];
                    th[2] = buf;
                    break;
                case 'C':
                    buf = th[0];
                    th[0] = th[2];
                    th[2] = buf;
                    break;
            }
        }
        int ans=0;
        for (int i = 0; i <3 ; i++) {
            if(th[i]==1) {
                ans = i + 1;
                break;
            }
        }
        pr.print(ans);
    }
}
