class LargestOddNumber {
    public String largestOddNumber(String num) {
        // traverse from rightmost digit to left
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            // check if digit is odd
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1); // take substring till that odd digit
            }
        }
        return ""; // no odd digit found
    }
}
