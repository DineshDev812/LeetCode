class Solution {
    // static{
    // Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
    //             fw.write("0");
    //         } catch (Exception e) {
    //         }
    //     }));
    // }
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small=1;
        for(int val:nums){
            if(val==small){
                small++;
            }
        }
        return small;
    }
}