class Solution {
    public boolean hasDuplicate(int[] nums) {
           Set<Integer> set = new HashSet<>();
for(int i=0;i<nums.length;i++){
    if(set.contains(nums[i])){

        return true;

    }

    else{
        set.add(nums[i]);
    }
}

        //   HashMap<Integer,Integer> map = new HashMap<>();
        //   for(int i=0;i<nums.length;i++){
        //             if(map.containsKey(nums[i])){
                     
        //                 map.put(nums[i],map.get(nums[i])+1);

        //                 if(map.get(nums[i])>1){
        //                     return true;
        //                 }
        //             }
        //             else{
        //                 map.put(nums[i],1);
        //             }
        //   }

          return false;






        
    }
}