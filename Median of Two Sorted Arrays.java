class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        int l1=nums1.length;
        int l2=nums2.length;
        double ans=0;
        boolean odd=true;
        if(len%2==0) odd=false;
        int mid=len/2;


        int p1=0,p2=0;
        int curr=-1,prev=-1;
        while(mid>=0){
            if(p2<l2 && p1<l1 && nums1[p1]<nums2[p2]){
                prev=curr;
                curr=nums1[p1];
                p1++;
            }

            else if(!(p2<l2)){
                prev=curr;
                curr=nums1[p1];
                p1++;
            }

            else if(!(p1<l1)){
                prev=curr;
                curr=nums2[p2];
                p2++;
            }
            else{
                prev=curr;
                curr=nums2[p2];
                p2++;
            }

            mid--;
            

        }

        if(odd){
            ans=curr;
        }
        else{
            ans=(double)(curr+prev)/2;
        }

        return ans;
    }
}