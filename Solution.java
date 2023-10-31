import java.util.*;

public class Solution {
    public static char mostFrequentChar(String s) {
      // creating a hashmap
      var charHashMap = new HashMap<Character, Integer>();
      
      // running a for loop to check each character of the String
      for(int i = 0; i < s.length(); i++){
        char c = s.toLowerCase().charAt(i);
          if (charHashMap.containsKey(c)){
          var count = charHashMap.get(c);
          charHashMap.put(c, ++count);
          } else {
          charHashMap.put(c, 1);
          }      
        }

        // creating an int to find the most frequent character

        int frequency = Integer.MIN_VALUE;
        var keySet = charHashMap.keySet();

        for(char c: keySet){
          if(charHashMap.get(c) >= frequency){
            frequency = charHashMap.get(c);
          }
        }
        char mostFrequent= 'a';
        for(char c: keySet){
          if (charHashMap.get(c) == frequency){
            mostFrequent = c ;
          }
        }
      return mostFrequent;
      
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("Mississippi")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'


    }

  }
