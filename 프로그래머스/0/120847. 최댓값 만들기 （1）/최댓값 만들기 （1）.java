class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //최대값 두개 뽑기
        int max1 = -1;
        int max2 = -1;
        int maxIndex = -1;
        for(int i=0; i< numbers.length; i++){
            if(max1 < numbers[i]) {
                max1 = numbers[i];
                maxIndex =i;
            }
        }
        System.out.print(maxIndex);
        for(int i=0; i< numbers.length; i++){
            if(i!= maxIndex && max2 < numbers[i]) {
             System.out.print(i);
                max2 = numbers[i];
            }
        }
        answer = max1 * max2;
        return answer;
    }
}