// 3. Group Anagrams

// Given an array of strings strs, group the 
// anagrams
//  together. You can return the answer in any order.

package Week4.Day5;

class problem3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>>  map = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
