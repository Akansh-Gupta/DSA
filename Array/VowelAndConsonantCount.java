import java.util.Scanner;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        str.toLowerCase().trim();
        int vowCount = 0, conCount = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') vowCount++;
            else if (ch==' ') continue;
            else conCount++;
        }
        System.out.println("No. of vowels: " + vowCount);
        System.out.println("No. of consonants: " + conCount);
        sc.close();
    }
}
