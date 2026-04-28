package codeforces;
import java.util.*;
import java.io.*;
public class odd_queries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            long[] prefix = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + Long.parseLong(st.nextToken());
            }
            while (q-- > 0) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long k = Long.parseLong(st.nextToken());
                long outsideSum = prefix[n] - (prefix[r] - prefix[l - 1]);
                long newSum = outsideSum + k * (r - l + 1);

                sb.append(newSum % 2 != 0 ? "YES" : "NO").append('\n');
            }
        }
        System.out.print(sb);
    }
}