import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = 0, t = 0;
            for(int i = 0; i < n; ++i) {
            int low = cin.nextInt(), up = cin.nextInt();
            t += up-low;
            ans = ans < t ? t : ans;
        }
        System.out.println(ans);
    }
}
/*
4
0 3
2 5
4 2
4 0

*/