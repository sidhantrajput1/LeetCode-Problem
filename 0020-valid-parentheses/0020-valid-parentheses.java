class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else { // ch == ')'
                if (st.size()==0) return false;
                int top = st.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || ( ch == ']' && top != '[' )) return false;
            }
        }
        if(st.size() > 0) return false;
        else return true;
    }
}