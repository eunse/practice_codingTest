/*
제일 작은 수 제거하기
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
https://programmers.co.kr/learn/courses/30/lessons/12935
*/
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if(arr.length==1){ // 리턴하려는 배열이 빈 배열
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[arr.length-1];
            int i = 0; // 제일 작은 수를 가지는 인덱스
            for(int j=1; j<arr.length; j++) if(arr[i]>arr[j]) i=j; 
            // j번째 수가 i번째(첫번째) 수보다 작으면 i에 j(제일 작은 수를 가진 인덱스)를 대입
            List<Integer> list = new ArrayList<Integer>();
            for(int k=0; k<arr.length; k++) if(k!=i) list.add(arr[k]);
            for(int l=0; l<list.size(); l++) answer[l] = list.get(l);
        }
        return answer;
    }
}
// 머리 굳.........었다..(not good...)
