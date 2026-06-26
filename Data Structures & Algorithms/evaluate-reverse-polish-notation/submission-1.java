class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operands = "+*/-";

        for(String token : tokens){

            if(operands.indexOf(token) != -1){
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(token.equals("+")){
                    stack.push(num1 + num2);
                }else if(token.equals("-")){
                    stack.push(num1 - num2);
                }else if(token.equals("*")){
                    stack.push(num1 * num2);
                }
                else if(token.equals("/")){
                    stack.push(num1 / num2);
                }
                continue;
            }
            stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}
