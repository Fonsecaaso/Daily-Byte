class Solution {
    public char[] reverseString(char[] s) {
        char aux;
        
        for(int i=0; i<s.length/2; i++){
            aux = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = aux;
        }
        
        return s;
    }
}
