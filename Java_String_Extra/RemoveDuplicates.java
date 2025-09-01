
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(res.indexOf(ch)==-1) res+=ch;
        }
        System.out.println(res);
    }
}

