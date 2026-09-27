class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean found = true;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ')'){
                st.push(s.charAt(i));
            }
            else{

                while(st.peek() != '('){
                    sb.append(st.pop());
                    
                }
                st.pop();

                for(int j = 0;j<sb.length();j++){
                    st.push(sb.charAt(j));
                }

                sb = new StringBuilder();
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}