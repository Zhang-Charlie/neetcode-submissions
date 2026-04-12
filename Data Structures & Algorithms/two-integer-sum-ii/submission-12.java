class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0 , r = 1;
        // System.out.println(numbers[l] + " " + numbers[r]);
        while(r < nums.length){   
            // System.out.println(numbers[l] + " " + numbers[r]);
            if(numbers[l] + numbers[r] == target) return new int[] {l + 1, r + 1};
            // if combines is smaller than target
            // if smaller  
            if(numbers[l] + numbers[r] < target ){
                r++;
            }else{
                l++;
            }
        }
        return new int[] {};
    }
}
