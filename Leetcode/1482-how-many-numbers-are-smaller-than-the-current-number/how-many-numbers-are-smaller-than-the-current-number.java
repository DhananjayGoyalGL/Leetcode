class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
    
    HashMap<Integer, Integer> numCounts = new HashMap<>();
    for(int i=0; i<sortedNums.length; i++){
        numCounts.putIfAbsent(sortedNums[i], i);
    }

    int[] result = new int[nums.length];
    for(int i=0; i<nums.length; i++){
        result[i] = numCounts.get(nums[i]);
    }
    return result;
}
}