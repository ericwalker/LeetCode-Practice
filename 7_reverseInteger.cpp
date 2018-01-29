// -2147483648 == (-2)^31
//  2147483647 == 2^31 - 1
class Solution {
public:
    int reverse(int x) 
    {
    	// use long long to calculate overflow number
    	long long result = 0;
    	long long long_x = x;
    	int sign = 1;
    	if (long_x < 0)
        {
        	sign = -1;
        	long_x = -long_x;
        }

        // x = 123
        // result = 321

       	for (;long_x > 0; long_x = long_x/10)
       	{
       		result = result*10 + long_x%10;
       	} 

       	// to judge if the result is overflow
       	if (result > 2147483647 || (sign==-1 && result > 2147483648)) 
       	{
            return 0;
        }

        else
        {
        	return result*sign;
        }
        
        
    }
};