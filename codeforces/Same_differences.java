package codeforces;
import java.util.*;
import java.io.*;
public class Same_differences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // ← trim here is fine
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            long count = 0;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                int key = val - i;
                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
}