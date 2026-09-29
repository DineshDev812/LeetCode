class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        find(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public static void find(int[] arr, int t, int ind, List<Integer> li, List<List<Integer>> ans) {
        if (t == 0) {

            ans.add(new ArrayList<>(li));
            return;
        }

        if (t < 0)
            return;

        for (int i = ind; i < arr.length; i++) {
            li.add(arr[i]);
            find(arr, t - arr[i], i, li, ans);
            li.remove(li.size() - 1);
        }
    }
}