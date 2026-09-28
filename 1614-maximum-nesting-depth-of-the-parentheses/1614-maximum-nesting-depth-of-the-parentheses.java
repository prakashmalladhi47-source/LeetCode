class Solution {
    public int maxDepth(String s) {
        int countMax = Integer.MIN_VALUE;
        int countMin = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push('(');
                countMin++;
            }

            if(s.charAt(i) == ')'){
                st.pop();
                countMin--;
            }

            if(countMin>countMax)
                countMax = countMin;
        } 

        return countMax;
    }
}