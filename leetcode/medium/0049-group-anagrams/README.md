# Group Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `strs`, group the anagrams together. You can return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  strs = ["eat","tea","tan","ate","nat","bat"]

 **Output:**  [["bat"],["nat","tan"],["ate","eat","tea"]]

 **Explanation:** 

- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

 **Example 2:** 

 **Input:**  strs = [""]

 **Output:**  [[""]]

 **Example 3:** 

 **Input:**  strs = ["a"]

 **Output:**  [["a"]]

 

 **Constraints:** 

- 1 <= strs.length <= 104
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 99.32%)  
**Memory:** 49.6 MB (beats 72.12%)  
**Submitted:** 2026-08-21T03:20:24.205Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> m =new HashMap<>();
       for(String s:strs){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        String st=new String(c);
        if(!m.containsKey(st)){
            m.put(st,new ArrayList<>());
        }
        m.get(st).add(s);
       } 
       return new ArrayList<>(m.values());
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/group-anagrams/)