import java.util.*;

public class CreateUsername {
    static String[] extractName(String name){
        String parts[] = name.trim().toLowerCase().split("\\s+");
        return parts;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        String fullName = sc.nextLine();
        String name[] = extractName(fullName);
        String firstName = name[0];
        String lastName = name[name.length-1];
        System.out.println("Enter Student ID: ");
        String studentID = sc.nextLine();
        System.out.println(firstName + "_" + lastName + studentID);
        sc.close();
    }
}
