class Solution {
    public boolean isAnagram(String s, String t) {
        // We would need to determine if the string has the same number of each char
        
        // 1st check: can't be anagrams if of different length
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] counts = new int[26];
        
        for(int i = 0; i<s.length(); i++) {
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        
        for(int i : counts) {
            if(i != 0){
                return false;
            }
        }
        
        return true;
    }
}