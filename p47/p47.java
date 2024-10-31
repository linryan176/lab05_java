package p47;
import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p47 {
    public static void main(String[] args)throws IOException {
		
        BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("請輸入5個人的分數");
        Integer test[]=new Integer[5];

        for(int i=0;i<test.length;i++)
        {
            String str=br.readLine();
            test[i]=Integer.parseInt(str);
            
        }
        Arrays.sort(test,Collections.reverseOrder());
        for(int k=0;k<test.length;k++)
        {
            System.out.println("第"+(k+1)+"個人的分數是："+test[k]);
        }
        
        System.out.println("考試人數有"+test.length+"人");
    }
}
