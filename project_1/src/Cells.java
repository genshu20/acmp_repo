import java.io.*;
import java.util.*;

public class Cells {

    public static void main(String[] args)throws Exception {
        File input=new File("input.txt");
        File output=new File("output.txt");
        Scanner sc=new Scanner(input);
        PrintStream pr=new PrintStream(output);
        String s=sc.next();
        String s2=s.substring(1);
        int int2=Integer.parseInt(s2);
        char ch1=s.charAt(0);
        char[] ch={'A','B','C','D','E','F','G','H'};
        for (int i = 0; i <8 ; i++) {
            if(ch[i]==ch1){
                if((int2%2==0&&i%2==0)||(int2%2!=0&&i%2!=0))pr.print("WHITE");
                else {
                    pr.print("BLACK");
                }
                break;
            }
        }
    }
}
