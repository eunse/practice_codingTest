/*
평균 구하기
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
https://programmers.co.kr/learn/courses/30/lessons/12944
*/
class Solution {
    public double solution(int[] arr) {

        int sum = 0;
        for(int a : arr) sum += a;

        return ((double)sum)/(arr.length);
    }
}
// 쉽다


/*
행렬의 덧셈
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
https://programmers.co.kr/learn/courses/30/lessons/12950
*/
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
// 오타 작렬 legnth -> length 


/*
핸드폰 번호 가리기
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
https://programmers.co.kr/learn/courses/30/lessons/12948
*/
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] arr = new String[phone_number.length()]; 
        for(int i=0; i<phone_number.length(); i++) arr[i] = phone_number.charAt(i)+"";
        for(int i=0; i<phone_number.length()-4; i++) arr[i] = "*";
        for(int i=0; i<phone_number.length(); i++) answer += arr[i];

        return answer;
    }
}
// 더 쉽고 짧게 하는 방법이 있을텐데

// --> 정규식 이용
class Solution {
    public String solution(String phone_number) {
      
        String answer = phone_number.replaceAll(".(?=.{4})", "*");

        return answer;
    }
}
// . : 임의의 문자 한 개
// ?= : 전방탐색, 등호(=) 다음에 일치할 텍스트가 오는 하위 표현식, 검색할 때는 뒤의 문자가 필요하지만 선택할 때는 뒤의 문자를 빼고 선택한다.
// .(?=.{4}) : 뒤쪽에서 임의의 문자 4개를 빼고 선택
// 어렵다
