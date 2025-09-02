
import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int max=0; char res=' ';
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++) if(str.charAt(j)==ch) count++;
            if(count>max){ max=count; res=ch; }
        }
        System.out.println("Most Frequent Character: "+res);
    }
}
