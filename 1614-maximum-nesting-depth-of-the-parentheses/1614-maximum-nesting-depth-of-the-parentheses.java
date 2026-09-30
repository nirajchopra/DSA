class Solution {
    public int maxDepth(String s) {
        int i = 0;

        Stack<Character> st = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                st.pop();
            }
            
            i = Math.max(i, st.size());
        }
        
        return i;
    }
}