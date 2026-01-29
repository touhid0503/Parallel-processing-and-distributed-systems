import java.util.Scanner;

public class Main2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        // System.out.println(name);
        String rev="";
        for(int i=name.length()-1; i>=0; i--){
            rev+=name.charAt(i);
        }
        System.out.println(rev);
    }
}
