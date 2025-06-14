package java_with_DSA;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int sum = 0;
        int prev = map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = map.get(s.charAt(i));
            if (prev < next) {
                sum -= prev;
            } else {
                sum += prev;
            }
            prev = next;
        }
        sum += prev; 
        return sum;
    }
    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();
        String roman = "MCMXCIV";  
        int result = sol.romanToInt(roman);
        System.out.println("Roman numeral " + roman + " = " + result);
    }
}
