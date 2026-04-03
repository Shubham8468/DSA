class Solution { public int[] dailyTemperatures(int[] temperatures) { int n = temperatures.length; int[] ans = new int[n]; Deque<Integer> stack = new ArrayDeque<>(); // monotonic decreasing stack of indices
 for (int i = 0; i < n; i++) { // Current temp is warmer → resolve all colder days waiting in the stack 
 while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) { int prevIdx = stack.pop(); ans[prevIdx] = i - prevIdx; // days waited for a warmer temperature
  } stack.push(i); } // Remaining indices in stack → no warmer future day → ans[i] stays 0 
  return ans; } }