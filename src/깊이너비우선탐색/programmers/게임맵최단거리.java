package 깊이너비우선탐색.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    public static void main(String[] args) {
        int result1 = new Solution().solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
        int result2 = new Solution().solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}});
        int result3 = new Solution().solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}});
        System.out.println(result1);
        System.out.println(result1);
        System.out.println(result1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result2);
        System.out.println(result2);
        System.out.println(result2);
        System.out.println(result3);
    }

    static class Solution {
        public int solution(int[][] maps) {
            int[][] visit = new int[maps.length][maps[0].length];
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0});
            visit[0][0] = 1;

            while (!queue.isEmpty()) {
                bfs(maps, queue, visit);
            }

            int result = visit[maps.length - 1][maps[0].length - 1];

            return result == 0 ? -1 : result;
        }

        private void bfs(int[][] maps, Queue<int[]> queue, int[][] visit) {
            int[] position = queue.poll();
            int x = position[0];
            int y = position[1];

            // 시계 방향
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX < 0 || newX >= maps.length || newY < 0 || newY >= maps[0].length)
                    continue;

                if (maps[newX][newY] == 1 && visit[newX][newY] == 0) {
                    visit[newX][newY] = visit[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
    }
}
