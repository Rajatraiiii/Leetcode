class Solution {
    public int romanToInt(String s) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int i = 0;
        int current = 0;
        int next = 0;
        int answer = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'I') current = I;
            else if (s.charAt(i) == 'V') current = V;
            else if (s.charAt(i) == 'X') current = X;
            else if (s.charAt(i) == 'L') current = L;
            else if (s.charAt(i) == 'C') current = C;
            else if (s.charAt(i) == 'D') current = D;
            else if (s.charAt(i) == 'M') current = M;

            
            if (i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'I') next = I;
                else if (s.charAt(i + 1) == 'V') next = V;
                else if (s.charAt(i + 1) == 'X') next = X;
                else if (s.charAt(i + 1) == 'L') next = L;
                else if (s.charAt(i + 1) == 'C') next = C;
                else if (s.charAt(i + 1) == 'D') next = D;
                else if (s.charAt(i + 1) == 'M') next = M;
            } else {
                next = 0;
            }

            if (current < next) {
                answer = answer - current;
            } else {
                answer = answer + current;
            }

            i++;
        }

        return answer;
    }
}