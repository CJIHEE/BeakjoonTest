import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int round = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        
        while (round < enemy.length) {
            n -= enemy[round];
            pq.add(enemy[round]);
            
            if (n < 0) {
                if (k > 0) { // 무적권을 사용할 수 있으면
                    n += pq.poll();
                    k--;
                } else {
                    break; // 게임 끝
                }
            }
            round++;
        }
        return round;
    }
}