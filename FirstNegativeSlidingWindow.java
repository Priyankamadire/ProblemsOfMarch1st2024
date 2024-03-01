import java.util.*;

public class FirstNegativeSlidingWindow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(slidingWindow(n, m, arr));
        System.out.print(solve(n, m, arr));

    }

    public static ArrayList<Integer> slidingWindow(int n, int k, int arr[]) {
        int i = 0; // start
        int j = 0; // end
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (j < n) {
            if (arr[j] < 0) {
                al.add(arr[j]); // store all negatives here
            }
            if (j - i + 1 < k) { // less than window size
                j++;
            } else if (j - i + 1 == k) {
                if (al.size() == 0) { // checks if any subarr/window dont contains negative
                    res.add(0);
                } else {
                    res.add(al.get(0));
                    if (arr[i] < 0) { // checking the starting index
                        al.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return res;

    }

    public static ArrayList<Integer> solve(int n, int k, int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i <= n - k; i++) {
            boolean found = false;

            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0 && !found) {
                    al.add(arr[j]);
                    found = true;
                }
            }
            if (!found) {
                al.add(0);
            }
        }

        return al;
    }

}
