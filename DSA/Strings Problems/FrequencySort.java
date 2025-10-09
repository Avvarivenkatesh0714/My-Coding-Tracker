import java.util.*;

class FrequencySort {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        // Step 1: Count frequencies
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Max Heap sorted by frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        pq.addAll(freq.entrySet());
        
        // Step 3: Build result
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int count = entry.getValue();
            
            for (int i = 0; i < count; i++) {
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}
