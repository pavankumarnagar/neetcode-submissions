class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int s=temp.length;
        int[] ans=new int[s];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<s;i++){
            while(!stack.isEmpty()&&temp[i]>temp[stack.peek()])
            {
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);    
        }
        return ans; 
    }
}
