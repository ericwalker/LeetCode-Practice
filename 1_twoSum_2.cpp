class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map <int, int> my_map;
        vector <int> result;


        for (int i = 0; i < nums.size(); i++){
        	// my_map.insert(pair<int, int> (nums[i], i));
        	my_map[nums[i]] = i; // save the key value into the unordered map.
        }

        // 
        for (int i = 0; i < nums.size(); i++){
        	const int gap = target - nums[i];
        	if (my_map.find(gap) != my_map.end() && my_map[gap] > i)
        	{
        		
    			result.push_back(i);
    			result.push_back(my_map[gap]);

    			break;
        		
        	}

        }

        return result;
    }
};