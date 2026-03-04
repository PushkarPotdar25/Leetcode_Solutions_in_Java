class Solution {
    public String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}