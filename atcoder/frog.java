package atcoder;
import java.util.*;
import java.io.*;

public class frog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[]h = new int[n];
        for(int i=0; i<n; i++){
            h[i] =Integer.parseInt(st.nextToken());
        }
        long[]d = new long[n];
        Arrays.fill(d,Long.MAX_VALUE);
        d[0] = 0;
        for(int i=0; i<n; i++){
            if(i>=1){
                d[i]=Math.min(d[i],d[i-1]+Math.abs(h[i]-h[i-1]));
            }
            if(i>=2){
                d[i]=Math.min(d[i],d[i-2]+Math.abs(h[i]-h[i-2]));
            }
        }
        System.out.println(d[n-1]);
    }
}
