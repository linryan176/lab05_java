package p49;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class p49 {
    public static void main(String[] args)throws IOException {
		
        int test[][];
        test=new int[2][5];

        test[0][0]=80;
        test[0][1]=60;
        test[0][2]=22;
        test[0][3]=50;
        test[0][4]=75;
        test[1][0]=90;
        test[1][1]=55;
        test[1][2]=68;
        test[1][3]=72;

        
            for(int k=0;k<5;k++)
            {
                int i=0;
                System.out.println("第"+(k+1)+"個人的國文分數是："+test[i][k]);
                i=i+1;
                System.out.println("第"+(k+1)+"個人的數學分數是："+test[i][k]);
            }
        
    }
}
