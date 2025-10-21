class MaximumNestingDepthoftheParentheses {
    public int maxDepth(String s) {
        int cnt = 0;
        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') cnt++;
            else if(ch == ')') cnt--;

            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}

// Example 1:

// Input: s = "(1+(2*3)+((8)/4))+1"

// Output: 3

// Explanation:

// Digit 8 is inside of 3 nested parentheses in the string.

// Example 2:

// Input: s = "(1)+((2))+(((3)))"

// Output: 3

// Explanation:

// Digit 3 is inside of 3 nested parentheses in the string.