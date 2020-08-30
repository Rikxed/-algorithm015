class Solution {

    //O(n) solution
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++) {
            Integer diff = (Integer)(target - numbers[i]);
            if(map.containsKey(diff)) {
                int result[] = {hash.get(diff), i};
                return result;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }


    /**   O(n^2) complexity solution
     *    public int[] twoSum(int[] nums, int target) {
     *         int[] result = {0,0};
     *         if (nums.length==0) return null;
     *         for (int i = 0; i < nums.length; i++) {
     *             for (int j = i+1; j < nums.length ; j++) {
     *                 if(nums[j]==target-nums[i])
     *                 {
     *                     result[0]=i;
     *                     result[1]=j;
     *                     break;
     *                 }
     *             }
     *         }
     *         return result;
     *     }
     */

}