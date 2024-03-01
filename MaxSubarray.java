import java.util.*;

public class MaxSubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solve(n, m, arr));
    }

    public static int solve(int n, int k, int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int j = 0;
        int i = 0;

        while (j < n) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                maxi = Math.max(maxi, sum);
                sum -= arr[i];
                i++;
                j++;
            }

        }

        return maxi;
    }

    public static int method2(int n, int k, int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxi = Math.max(sum, maxi);
        }
        return maxi;
    }

}
