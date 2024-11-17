import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;
    static int n;
    static int count;
    static int maxCount;
    static int rowCount;
    static int maxRowCount;
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        arr = new char[n][n];
        for(int i =0; i<n; i++){
            String line = bf.readLine();
             for(int j =0; j< n; j++){
                 arr[i][j] = line.charAt(j);
             }
        }

        solution();
        System.out.println(Math.max(maxCount,maxRowCount));

    }

    private static void solution(){
        char temp;
        //열 변경경 -> 변경한 행 2개 검사 ->원상 복구
        for(int i=0; i<n; i++){
            for(int  j=0; j<n-1; j++){
                //행 switch
                temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;

                //탐색, 연속하는지 검사
               Search();

                //원상 복구
                arr[j+1][i] = arr[j][i];
                arr[j][i] = temp;

               //열 swithch
                temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;

                Search();

                //원상 복구
                arr[i][j+1] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    //열 탐색
    private static void Search(){
        /*
          1. 타겟 설정(검사 시작 문자)
          2. 다음 타겟 검사
             -if 타겟과 동일하면 count++, max 갱신
             else count=1 타겟 재설정
         */

        for(int i=0; i<n; i++){
            count =1;
            rowCount = 1;

            for(int j=0; j<n-1; j++){
                //행 검사
                if(arr[j][i] == arr[j+1][i]){
                    count++;
                    maxCount = Math.max(maxCount,count);
                }else{
                    count=1;
                }

                //열 검사
                if(arr[i][j] == arr[i][j+1]){
                    rowCount++;
                    maxRowCount = Math.max(maxRowCount,rowCount);
                }else{
                    rowCount=1;
                }
            }

        }
    }


}
