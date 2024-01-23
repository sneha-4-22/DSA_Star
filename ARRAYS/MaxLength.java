class Solution {
    private boolean helper(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.add(ch))
                return false;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        List<String> list = new ArrayList<>();
        list.add("");
        int res = 0;
        for (String word : arr) {
            for (int i = 0; i < list.size(); i++) {
                String newword = list.get(i) + word;
                if (helper(newword)) {
                    list.add(newword);
                    res = Math.max(res, newword.length());
                }
            }
        }
        return res;
    }
}
