package p45;
import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {
    public static void main(String[] args)throws IOException {
		
        BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("請輸入5個人的分數");
        int test[]=new int[5];

        for(int i=0;i<test.length;i++)
        {
            String str=br.readLine();
            test[i]=Integer.parseInt(str);
            
        }
        for(int i=0;i<test.length-1;i++)
        {
            for(int j=i+1;j<test.length;j++)
            {
                if(test[j]>test[i])
                {
                    int temp=test[j];
                    test[j]=test[i];
                    test[i]=temp;
                }
            }
        }
        for(int k=0;k<test.length;k++)
        {
            System.out.println("第"+(k+1)+"個人的分數是："+test[k]);
        }
        
        System.out.println("考試人數有"+test.length+"人");
    }
}
