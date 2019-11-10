class CombinationSum {
    public static List<List<Integer>> list = new ArrayList<>();
    public static List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,0,target);
        return list;

    }
    public void dfs(int[] candidates,int index,int target){
         for(int i=index;i<candidates.length;i++){
             if(target==0){
                 System.out.println(temp);
                 list.add(temp);
                 return;
             }
             if(target-candidates[i]>=0){
                 // System.out.println(candidates[i]);
                 temp.add(candidates[i]);
                 dfs(candidates,i,target-candidates[i]);
                 temp.remove(temp.size()-1);
             }
         }
    }
}
