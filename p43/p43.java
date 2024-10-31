package p43;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class p43 {
    public static void main(String[] args)throws IOException {
		
        int []test={80,60,22,50,75};

        for(int i=0;i<test.length;i++)
        {
            System.out.println("第"+(i+1)+"個人的分數是："+test[i]);
        }
        System.out.println("考試人數有"+test.length+"人");
    }
}
