class Pair {
    int temperature;
    int index;

    Pair(int temperature, int index) {
        this.temperature = temperature;
        this.index = index;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Pair> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().temperature <= temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek().index - i;
            }
            stack.push(new Pair(temperatures[i], i));
        }

        return result;
    }
}