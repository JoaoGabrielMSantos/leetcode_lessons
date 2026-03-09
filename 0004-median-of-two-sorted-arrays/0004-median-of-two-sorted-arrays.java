class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double>res=new ArrayList<>();
        for(double num:nums1){
            res.add(num);
        }
        for(double num2:nums2){
            res.add(num2);
        }
        Collections.sort(res);

        int mid=res.size()/2;

        if(res.size()%2==0){
            return (res.get(mid)+res.get(mid-1))/2;
        }
        return res.get(mid);


    }
}