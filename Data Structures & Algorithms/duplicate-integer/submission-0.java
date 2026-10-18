class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// {1, 2, 3, 3}
// hs {0} -> hs {1}
// hs {1} -> hs {1, 2}
// hs {1, 2} -> hs {1, 2, 3}
// hs {1, 2, 3} -> returns true
// TC - O(N) ;  SC - O(N)