class Solution {
    public List<String> commonChars(String[] words) {

        List<Character> list = new ArrayList<>();

        for(char ch : words[0].toCharArray()) {
            list.add(ch);
        }

        for(int i = 1; i < words.length; i++) {

            List<Character> temp = new ArrayList<>();

            for(int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j);

                if(list.contains(ch)) {
                    temp.add(ch);

                    list.remove((Character) ch);
                }
            }

            list = temp;
        }

        List<String> ans = new ArrayList<>();

        for(char ch : list) {
            ans.add(String.valueOf(ch));
        }

        return ans;
    }
}