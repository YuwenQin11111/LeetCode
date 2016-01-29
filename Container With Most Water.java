public class Solution{

public int maxArea(int[] height) {  
   int len = height.length, low = 0, high = len -1 ;  
   int max = 0;  
   while (low < high) {  
     max = Math.max(max, (high - low) * Math.min(height[low], height[high]));  
     if (height[low] < height[high]) {  
       low++;  
     } else {  
       high--;  
     }  
   }  
   return max;  
 }
}
