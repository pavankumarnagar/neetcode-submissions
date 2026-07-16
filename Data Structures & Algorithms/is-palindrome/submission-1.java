class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] d = cleaned.toCharArray();
        int l = d.length;
        
        for (int i = 0; i < l / 2; i++) {
            if (d[i] != d[l - i - 1]) {
                return false;  
            }
        }
        
        return true;  
    }
}
