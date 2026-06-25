class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=getMax(piles);

        while(low<high){
            int mid=low+(high-low)/2;
            if(canFinish(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }

    public boolean canFinish(int [] piles , int speed , int h){
        int hours=0;
        for(int pile:piles){
       hours += (pile + speed - 1) / speed;
        }
        return hours<=h;
    }

    public int getMax(int [] piles){
        int maximum=piles[0];
        for(int pile:piles){
         maximum=Math.max(maximum,pile);
        }
        return maximum;
    }
}
