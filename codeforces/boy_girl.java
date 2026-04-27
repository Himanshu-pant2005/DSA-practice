package codeforces;
import java.util.HashSet;
import java.util.Scanner;
public class boy_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for( char c : n.toCharArray()) {
            set.add(c);
        }
        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
