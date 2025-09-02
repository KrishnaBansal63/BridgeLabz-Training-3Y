
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)) res+=Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch)) res+=Character.toUpperCase(ch);
            else res+=ch;
        }
        System.out.println(res);
    }
}

