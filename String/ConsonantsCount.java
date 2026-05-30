import java.util.Scanner;

public class ConsonantsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if("aeiou".indexOf(ch)==-1) count++;
        }
        System.out.println("No. of consonants: " + count);
        sc.close();
    }
}
