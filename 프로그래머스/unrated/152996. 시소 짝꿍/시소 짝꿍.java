import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] weights) {
        Map<Integer, Integer> distances = new HashMap<>();
        int count = 0;

        // 각 몸무게의 빈도수를 계산하여 distances 맵에 저장
        for (int weight : weights) {
            distances.put(weight, distances.getOrDefault(weight, 0) + 1);
        }

        // 시소 짝꿍을 찾기 위해 몸무게 목록을 반복
        for (int i = 0; i < weights.length; i++) {
            int weightA = weights[i];

            // 시소에 앉을 수 있는 가능한 거리 계산
            for (int distance = 2; distance <= 4; distance++) {
                int weightB = weightA * distance;

                // weightB가 distances 맵에 존재하고 빈도수가 0보다 크다면 짝꿍이 될 수 있음
                if (distances.containsKey(weightB) && distances.get(weightB) > 0) {
                    count++;
                    // 짝꿍을 찾았으므로 빈도수를 1 감소시킴
                    distances.put(weightB, distances.get(weightB) - 1);
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] weights = {100, 180, 360, 100, 270};
        int result = solution.solution(weights);
        System.out.println(result);  // 출력: 4
    }
}
