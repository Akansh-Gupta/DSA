import java.util.*;

//Sort string and find permutations by holding one character and swapping rest
public class StringPermutations {
    static String swap(String s, int i, int j){
        char arr[] = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    static void permutaions(String s, int l, int r){
        if(l == r) {
            System.out.println(s);
            return; 
        }
        for(int i=l; i<=r; i++){
            s = swap(s, l ,i);
            permutaions(s, l+1, r);
            s = swap(s, l ,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("All possible permutations: ");
        permutaions(str, 0, str.length()-1);
        sc.close();
    }
}