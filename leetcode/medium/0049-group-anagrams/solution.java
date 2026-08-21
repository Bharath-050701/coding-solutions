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