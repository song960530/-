package 깊이너비우선탐색.programmers;

public class 타겟넘버 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1, 1, 1, 1},3));
        System.out.println(new Solution().solution(new int[]{4, 1, 2, 1},4));
        System.out.println("test");
    }

    static class Solution {
        private int count = 0;

        public int solution(int[] numbers, int target) {

            dfs(numbers, 0, 0, target);

            return count;
        }

        private void dfs(int[] numbers, int depth, int sum, int target) {
            if (numbers.length == depth) {
                if(sum == target) this.count++;
            } else {
                dfs(numbers,depth+1,sum+numbers[depth],target);
                dfs(numbers,depth+1,sum-numbers[depth],target);
            }
        }
    }
}


