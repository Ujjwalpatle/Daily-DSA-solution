import java.util.Stack;

class Solution {
    public int findMaxDiff(int[] arr) {
        int[] ls = new int[arr.length];
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s1.isEmpty() && arr[s1.peek()] <= arr[i]) {
                s1.pop();
            }
            if (!s1.isEmpty()) {
                ls[i] = s1.peek();
            } else {
                ls[i] = 0;
            }
            s1.push(i);
        }

        int[] rs = new int[arr.length];
        Stack<Integer> s2 = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s2.isEmpty() && arr[s2.peek()] <= arr[i]) {
                s2.pop();
            }
            if (!s2.isEmpty()) {
                rs[i] = s2.peek();
            } else {
                rs[i] = arr.length - 1;
            }
            s2.push(i);
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, Math.abs(ls[i] - rs[i]));
        }
        return ans;
    }
}
