class Solution {
    public int countCommas(int n) {
        int count=0;
        int original=n;
        int i=0;
        while(i<n){
             int temp=n%10;

             if(n<1000){
                return 0;
             }
             if(n>=1000){
                int answer=n-999;
                  return answer;
             }
             n=n/10;
             
            
             
             
        }
        return 0;
      
        

       

        
    }
    
}