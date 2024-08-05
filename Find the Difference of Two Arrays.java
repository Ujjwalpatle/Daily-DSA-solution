class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> Set1 = new HashSet<>();
        Set<Integer> Set2 = new HashSet<>();

        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int num : nums1) Set1.add(num);
        for (int num : nums2) Set2.add(num);
        
        
        for (int num : Set1) {
            if (Set2.contains(num)==false) {
                ans1.add(num);
            }  
        }
        
        for (int num : Set2) {
            if (Set1.contains(num)==false) {
                ans2.add(num);
            }
        }

        list.add(ans1);
        list.add(ans2);

        return list;


    }
}