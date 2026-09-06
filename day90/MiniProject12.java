/**
Day 90 – MiniProject #12
Task: Build a Password Strength Analyzer
Use HashMap for character frequency & Recursion for pattern checks.
Goal: Combine all learned concepts in one small project.
 */

import java.util.*;
public class MiniProject12{
    public static String analyzePassword(String password){
        List<String> issues = new ArrayList<>();

        // 1. Length check
        boolean goodLength = password.length() >= 8;
        if(!goodLength) issues.add("Too short (min 8 characters recommended)");

        // 2. Character diversity check
        boolean hasUpper=false, hasLower=false, hasDigit=false, hasSpecial=false;
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isLowerCase(c)) hasLower = true;
            else if(Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }
        int diversity = (hasUpper?1:0)+(hasLower?1:0)+(hasDigit?1:0)+(hasSpecial?1:0);
        if(diversity < 3) issues.add("Low character variety (mix uppercase, lowercase, digits, symbols)");

        // 3. Character frequency check (HashMap) - flag if any char repeats too often
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : password.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int maxRepeat = 0;
        for(int count : freq.values()) maxRepeat = Math.max(maxRepeat, count);
        boolean tooRepetitive = maxRepeat > Math.max(2, password.length()/3);
        if(tooRepetitive) issues.add("One character repeats too often");

        // 4. Sequential pattern check (Recursion)
        boolean hasPattern = hasSequentialPattern(password, 0);
        if(hasPattern) issues.add("Contains a sequential pattern (e.g. abcd, 1234)");

        // Final rating - gated on real weaknesses, not just an additive score
        String rating;
        if(issues.isEmpty() && goodLength && diversity >= 3){
            rating = "STRONG";
        } else if(issues.size() <= 1 && diversity >= 2){
            rating = "MEDIUM";
        } else {
            rating = "WEAK";
        }

        StringBuilder result = new StringBuilder();
        result.append("Password: ").append(password).append(" -> ").append(rating).append("\n");
        if(!issues.isEmpty()){
            for(String issue : issues) result.append("  - ").append(issue).append("\n");
        }
        return result.toString();
    }

    // Recursive check: does the password contain a 4-character increasing run (e.g. "abcd", "1234")?
    public static boolean hasSequentialPattern(String s, int index){
        int runLength = 4;
        if(index + runLength > s.length()) return false; // base case

        boolean isSequential = true;
        for(int i = index; i < index + runLength - 1; i++){
            if(s.charAt(i+1) - s.charAt(i) != 1){
                isSequential = false;
                break;
            }
        }
        if(isSequential) return true;

        return hasSequentialPattern(s, index + 1); // recurse to next starting position
    }

    public static void main(String[] args) {
        System.out.println(analyzePassword("abcd1234"));
        System.out.println(analyzePassword("aaaa1111"));
        System.out.println(analyzePassword("Xk9$mQ2!"));
        System.out.println(analyzePassword("password"));
        System.out.println(analyzePassword("Tr0ub4dor&3"));
    }
}