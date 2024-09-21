class Solution {
    public int solution(int n, String control) {
        for(char x :control.toCharArray()){
            if(x == 'w') n++;
            else if(x =='s') n--;
            else if(x == 'd') n+=10;
            else if(x == 'a' ) n-=10;
        }
        return n;
    }
}