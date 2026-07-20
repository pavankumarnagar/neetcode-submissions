class Solution {
    public boolean isValid(String s) {
        int size=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<size;i++)
        {
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
            stack.push(s.charAt(i));
            else
            {
                if(stack.isEmpty())
                return false;
                char c2=stack.pop();
                if(ch==']'&&c2!='['||ch=='}'&&c2!='{'||ch==')'&&c2!='(')
                return false;
            }
        }
        return stack.isEmpty();   
    }
}
