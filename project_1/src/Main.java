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
//        String s=sc.next();
//        int[]th={1,0,0};
//        for (int i = 0; i <s.length() ; i++) {
//            int buf;
//            char ch = s.charAt(i);
//            switch (ch) {
//                case 'A':
//                    buf =th[0];
//                    th[0] = th[1];
//                    th[1] = buf;
//                    break;
//                case 'B':
//                    buf = th[1];
//                    th[1] = th[2];
//                    th[2] = buf;
//                    break;
//                case 'C':
//                    buf = th[0];
//                    th[0] = th[2];
//                    th[2] = buf;
//                    break;
//            }
//        }
//        int ans=0;
//        for (int i = 0; i <3 ; i++) {
//            if(th[i]==1) {
//                ans = i + 1;
//                break;
           // }
        //}
        //pr.print(ans);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=Math.min(a,b);
//        int d=Math.max(a,b);
//        int[]in={d,c};
//        while (in[1]!=0){
//            int buf=in[1];
//            in[1]=in[0]%in[1];
//            in[0]=buf;
//        }
//        pr.print(in[0]);
//        int n=sc.nextInt();
//        int nOld=-1;
//        int old=0;
//        for (int i = 1; i <=n ; i++) {
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            if(a>old&&b==1){
//                old=a;
//                nOld=i;
//            }
//        }
//        pr.print(nOld);
//        double x1=sc.nextLong();
//        double y1=sc.nextLong();
//        double x2=sc.nextLong();
//        double y2=sc.nextLong();
//        double x3=sc.nextLong();
//        double y3=sc.nextLong();
//        double s=Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2;
//        pr.print(s);
//        int n=sc.nextInt();
//        int[]ar=new int[n];
//        for (int i = 0; i <n; i++) {
//            ar[i]=sc.nextInt();
//        }
//        int nSub=sc.nextInt();
//        for (int i = 0; i <nSub ; i++) {
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            int[]tmp=Arrays.copyOfRange(ar,a-1,b);
//            for (int j:tmp) {
//                pr.print(j+" ");
//            }
//            pr.println();
//        }
        int n=sc.nextInt();
        int[]days=new int[n];
        ArrayList<Integer>evenList=new ArrayList<>();
        ArrayList<Integer>unEvenList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            days[i]=sc.nextInt();
            if (days[i]%2==0)evenList.add(days[i]);
            else unEvenList.add(days[i]);
        }
        for(Integer i:unEvenList){
            pr.print(i+" ");
        }
        pr.println();
        for(Integer i:evenList){
            pr.print(i+" ");
        }
        pr.println();
        if(evenList.size()>=unEvenList.size())pr.print("YES");
        else pr.print("NO");
    }
}
