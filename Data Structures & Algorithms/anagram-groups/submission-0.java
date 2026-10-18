class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Map to store:
        // key   -> frequency pattern of a word
        // value -> list of words matching that patter
        HashMap<String, List<String>> res = new HashMap<>();

        // Loop through each word in input
        for(String s : strs){
            // Frequency array for 26 lowercase letters
            // count[0] -> 'a', count[1] -> 'b', ...
            int[] count = new int[26];

            // Count frequency of each character in the word
            for(char c : s.toCharArray()){
                count[c-'a']++; // map char to index
            }

            // Convert frequency array into string
            // This string uniquely represents the letter counts
            // Example: "eat" -> "[1,0,0,0,1,...,1]"
            String key = Arrays.toString(count);

            // If this frequency pattern not seen before,
            // create a new list for it
            res.putIfAbsent(key, new ArrayList<>());

            // Add current word to its anagram group
            res.get(key).add(s);
        }
        // Return only the grouped lists (ignore keys)
        return new ArrayList<>(res.values());
    }
}
