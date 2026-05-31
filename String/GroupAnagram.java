import java.util.*;

public class GroupAnagram {
    static List<List<String>> groupAnagram(String strs[]) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int freq[] = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : freq) {
                sb.append(",");
                sb.append(i);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + n + " strings: ");
        String strs[] = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        List<List<String>> arr = new ArrayList<>();
        arr = groupAnagram(strs);
        for (List<String> s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}
