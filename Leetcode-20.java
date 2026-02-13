class Solution {
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();

        if(chars.length <= 1) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for(int i=0; i < chars.length ;i++){
            char curr = chars[i];
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(map.containsKey(curr) && last == map.get(curr)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(curr);
        }

        return stack.isEmpty();
    }
}
