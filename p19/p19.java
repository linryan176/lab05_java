package p19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {
    public static void main(String[] args)throws IOException {
		
        System.out.println("請問你是男生嗎？");
		System.out.println("請輸入y或n");
		BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();
        char letter=str.charAt(0);
		
        if(letter=='n'||letter=='N')
        {
            System.out.println("妳是女生");
        }
        else if(letter=='y'||letter=='Y')  
        {
            System.out.println("你是男生");
        }
        else
        {
            System.out.println("請輸入y或n");
        }  
        }
    }

