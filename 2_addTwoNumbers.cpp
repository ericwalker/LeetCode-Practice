/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

struct ListNode {
	int val;
	ListNode *next;
	// ListNode(int x) : val(x), next(NULL) {}
	// ListNode next;
};

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
    	ListNode dummy(-1); // head node

        ListNode *prev = &dummy; // keypoint

        ListNode *ptr1 = l1;
        ListNode *ptr2 = l2;
        
        int carry = 0;
        int num1 = 0, num2 = 0;
        

        while (ptr1 != nullptr || ptr2 != nullptr)
        {
            
            if (prev->next == nullptr)
            {
                prev->next = new ListNode(0);
                prev = prev->next;
            }
            
            else // because with carry, the nextNode has already created
            {
                prev = prev->next;
            }
            
            if (ptr1 == nullptr)
            {
                int num1 = 0;
            }
            else
            {
                num1 = ptr1->val;
            }
            if (ptr2 == nullptr)
            {
                int num2 = 0;
            }
            else
            {
                num2 = ptr2->val;
            }
            
        	prev->val = num1 + num2 + carry;
            carry = prev->val / 10;
            prev->val = prev->val % 10;
        	//prev->next = nullptr;

        	if (carry > 0)
        	{
        		// prev->val = prev->val % 10;
        		// carry = prev->val/10;
                prev->next = new ListNode(carry);
                prev = prev->next;
                // prev->next = nullptr;  
        	}
        	// else
        	// {
        	// prev->next = new ListNode(0);
        	// prev = prev->next;
        	// prev->next = nullptr;
        	// }
            
            if(ptr1 != nullptr)
            {
                ptr1 = ptr1->next;
            }
            // else
            // {
            //     ptr1->next = new ListNode(0);
            //     ptr1 = ptr1->next;
            // }
            
            if(ptr2 != nullptr)
            {
                ptr2 = ptr2->next;
            }
            // else
            // {
            //     ptr2->next = new ListNode(0);
            //     ptr2 = ptr2->next;
            // }
        	
        }

        return dummy.next;
    }
};