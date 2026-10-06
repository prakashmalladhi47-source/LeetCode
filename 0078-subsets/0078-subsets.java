class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>());

        for(int i = 1;i<(1<<nums.length);i++){
            int k = i;
            int index = 0;
            List<Integer> temp = new ArrayList<>();
            while(k>0){
                if((k&1) == 1) temp.add(nums[index]);
                k = k>>1;
                index++;
            }

            arr.add(temp);
        }

        return arr;
    }
}