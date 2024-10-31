package p32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32 {
    public static void main(String[] args)throws IOException {
		
        System.out.println("請問要跳過第幾次處理的迴圈呢？（1～10）");
		
		BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();
        int res=Integer.parseInt(str);
		
        for(int i=1;i<=10;i++)
        {
            if(i==res)
                continue;
            System.out.println("第"+i+"次的迴圈");
            
        }

        System.out.println("結束處理迴圈");
    }
}
