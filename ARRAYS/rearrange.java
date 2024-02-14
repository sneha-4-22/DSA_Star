class rearrange {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> nes = new ArrayList<>();
        for(int num:nums){
            if(num>0) pos.add(num);
            else nes.add(num);
        }
        int pidx=0;
        int nidx=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {nums[i] =pos.get(pidx);pidx++;}
            else {nums[i]=nes.get(nidx);nidx++;}
        }
        return nums;
    }
}
