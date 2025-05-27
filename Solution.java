package company.Java;
import java.util.*;
public class Solution {
        public List<List<String>> groupAnagrams(List<String> fileNames) {
            if (fileNames == null || fileNames.isEmpty()) {
                return new ArrayList<>();
            }

            Map<String, List<String>> anagramGroups = new HashMap<>();

            for (String fileName : fileNames) {
                char[] chars = fileName.toCharArray();
                Arrays.sort(chars);
                String sortedFileName = new String(chars);
                anagramGroups.computeIfAbsent(sortedFileName, k -> new ArrayList<>()).add(fileName);
            }
            return new ArrayList<>(anagramGroups.values());
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            // Example 1
            List<String> input1 = Arrays.asList("act", "pots", "tops", "cat", "stop");
            List<List<String>> output1 = solution.groupAnagrams(input1);
            System.out.println("Input: " + input1);
            System.out.println("Output: " + output1);
            // Expected output (order may vary): [[act, cat], [pots, tops, stop]]

            // Example 2
            List<String> input2 = Arrays.asList("listen", "silent", "apple", "bat", "tab");
            List<List<String>> output2 = solution.groupAnagrams(input2);
            System.out.println("\nInput: " + input2);
            System.out.println("Output: " + output2);
            // Expected output (order may vary): [[listen, silent], [apple], [bat, tab]]
        }
    }
