import java.util.*;

/*
개발자가 사용하는 언어와 언어 선호도를 입력하면 그에 맞는 직업군을 추천해주는 알고리즘을 개발하려고 합니다.
아래 표는 5개 직업군 별로 많이 사용하는 5개 언어에 직업군 언어 점수를 부여한 표입니다.

..이하 https://programmers.co.kr/learn/courses/30/lessons/84325?language=java
*/

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
      
        int score = -1; // 언어 선호도 * 직업군 언어 점수중 제일 높은 항목을 저장할 변수
      
        for(String s : table){
            
            String[] tables = s.split(" "); // 직업군과 언어가 저장된 문자열을 쪼개서 배열로 저장
            String tsname = tables[0]; // 직업군 이름
            int score2 = 0;
            
            for(int i=0; i<languages.length; i++){
                
                int index = Arrays.asList(tables).indexOf(languages[i]); // 직업군,언어가 저장된 배열에서 해당 언어의 인덱스를 찾음
                if(index>-1){
                    score2 += preference[i]*(6-index); // 언어 선호도 * 직업군 언어 점수를 누적시킴
                }

                if(score2>score){ // 총 점수가 이전 점수보다 높으면
                    score = score2; // 점수를 새롭게 대입
                    answer = tsname; // 제일 높은 점수를 가진 직업군을 변수에 저장
                } else if(score2==score && answer.compareTo(tsname)>0){ // 만약 점수가 같다면 두 직업군 중 이름이 사전 순으로 더 빠른 항목을 저장한다.
                    answer = tsname;
                }
            }
        }
        return answer;
    }
}
