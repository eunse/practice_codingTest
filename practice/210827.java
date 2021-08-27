/*
하샤드 수
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
*/
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = x+"";
        int num = 0;
        for(int i=0; i<str.length(); i++){
            num += str.charAt(i)-'0'; 
            // char 타입은 숫자 또한 아스키 코드를 가지므로 '0'의 아스키 코드를 빼주면 원래의 숫자값이 나오게 된다.
        }
        if(x%num!=0) answer = false; 
        
        return answer;
    }
}
// 아스키 코드!!!


/*
짝수와 홀수
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
https://programmers.co.kr/learn/courses/30/lessons/12937
*/
class Solution {
    public String solution(int num) {
        String answer = num%2==0 ? "Even" : "Odd";
        return answer;
    }
}
// 삼항연산자 오랫만에 써봄





