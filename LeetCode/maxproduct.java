class Solution {
   public int maxProduct(int[] nums) {
       int maxPro=nums[0];
       int minPro=nums[0];
       int answer = nums[0];
       for(int i =1; i<nums.length; i++){
           if(nums[i]<0){
               int temp=maxPro;
               maxPro=minPro;
               minPro=temp;  
           }
            maxPro= Math.max( maxPro*nums[i],   nums[i]); 
            minPro= Math.min( minPro*nums[i], nums[i]);
            answer=Math.max(answer, maxPro);           
       }
     
       return answer;
   }
}
