class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        if(s.equals("")||t.equals("")) return false;

        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);

        String sc = new String(schar);
        String tc = new String (tchar);
        if(sc.equals(tc)) return true;
        else return false;
    }
}