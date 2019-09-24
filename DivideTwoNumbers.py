class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 1){
		return dividend;
	}
	if(dividend == divisor){
		return 1;
	}
          boolean isNegative=false;
          if(divisor<0 && dividend>0||divisor>0 && dividend<0){
              isNegative=true;
              if(divisor<0)
                  divisor=Math.abs(divisor);
              else
                  dividend=Math.abs(dividend);
          }
          int sum=0;
          int remain=dividend;
          int count=0;
          while(sum<dividend && remain>divisor){
              sum+=divisor;
              remain=dividend-sum;
              count++;
          }
        if(isNegative==true)
            return -count;
        else
            return count;
    }
}
