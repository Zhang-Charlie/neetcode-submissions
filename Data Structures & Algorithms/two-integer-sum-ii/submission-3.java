class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0 , r = 1;

        while(l < r){   
            System.out.println();
            if(numbers[l] + numbers[r] == target) return new int[] {numbers[l], numbers[r]};
            l++;
            r++;

        }
        return new int[] {};
    }
}
