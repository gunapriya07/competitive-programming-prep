// 1. Permutations

// Given an array nums of distinct integers, return all the possible 
// permutations
// . You can return the answer in any order.

//Solution:

class problem1 {
  public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> list = new ArrayList<>();
      backtrack(list,new ArrayList<>(),nums);
      return list;
  }
  public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
      if(tempList.size() == nums.length){
          list.add(new ArrayList<>(tempList));
      }else{
          for(int i =0;i<nums.length;i++){
              if(tempList.contains(nums[i])) continue;
              tempList.add(nums[i]);
              backtrack(list,tempList,nums);
              tempList.remove(tempList.size() - 1);
          }
      }
  }
}