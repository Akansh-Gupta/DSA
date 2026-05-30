import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') count++;
        }
        System.out.println("No. of vowels: " + count);
        sc.close();
    }
}
