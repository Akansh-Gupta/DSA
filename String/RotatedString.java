import java.util.Scanner;
public class RotatedString {
    static boolean rotated(String s, String g){
        if(s.length() != g.length()) return false;
        return (s+s).contains(g);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter goal: ");
        String goal = sc.nextLine();
        if(rotated(str, goal)){
            System.out.println("String contains the goal");
        }
        else{
            System.out.println("String doesn't contain the goal");
        }
        sc.close();
    }
}