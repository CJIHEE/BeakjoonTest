import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=2; i<=n; i++){
           arr[i] = i;
        }

        System.out.print(solution(n,k,arr));

    }

    private static int solution(int n, int k, int arr[]) {
        int count =0;
        int answer = 0;

        for(int i=2; i<=n; i++){
            if(arr[i] !=-1){
                arr[i] = -1;
                count++;
                if(count == k){
                    return i;
                }
                for(int j=i+i; j<=n; j+=i){
                    if (arr[j] != -1) {
                        arr[j] =-1;
                        count++;
                        if(count == k){
                            return j;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
