class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        if(strs.length==0) return resultList;
        Map<String,List> resultMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String a = strs[i];
            char[] al = a.toCharArray();
            List anagram = new ArrayList();
            Arrays.sort(al);
            String key = new String(al);
            if(!resultMap.containsKey(key)) {
                anagram.add(a);
                resultMap.put(key, anagram);
            }
            else if(resultMap.containsKey(key))
            {
                List anagramnew = resultMap.get(key);
                anagramnew.add(a);
                resultMap.put(key,anagramnew);
            }
        }

        resultMap.forEach((k,v)->{
            resultList.add(v);
        });
        return resultList;
    }
}