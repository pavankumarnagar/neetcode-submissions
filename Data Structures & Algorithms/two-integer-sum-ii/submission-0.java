class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length=numbers.length;
        int start=0;
        int end=length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end]>target)
            end--;
            else if(numbers[start]+numbers[end]<target)
            start++;
            else if(numbers[start]+numbers[end]==target)
            return new int[]{start+1,end+1};
            //start++;
            //end--;
        }
        return new int[]{};
        
    }
}
