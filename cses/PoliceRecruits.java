package cses;
import java.util.*;
import java.io.*;
public class PoliceRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int freeOfficers = 0;
        int untreated = 0;
        for (int i = 0; i < n; i++) {
            int event = Integer.parseInt(st.nextToken());
            if (event > 0) {
                freeOfficers += event;
            } else {
                if (freeOfficers == 0) {
                    untreated++;  
                } else {
                    freeOfficers--;  
                }
            }
        }  
        System.out.println(untreated);
    }
}