class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        if(n > slice){
            for(int i=1; i<= n; i++){
                if(slice * i >= n){
                    return answer = i;
                }
            }
        }
        return answer;
    }
}