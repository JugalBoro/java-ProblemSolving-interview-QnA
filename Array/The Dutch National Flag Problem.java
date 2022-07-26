Brute Force : Time Complexity: O(N*logN)

              Space Complexity: O(1)
                
               Sorting ( even if it is not the expected solution here but it can be considered as one of the approaches). 
               Since the array contains only 3 integers, 0, 1, and 2. Simply sorting the array would arrange the elements in increasing order.
                
                
Better Approach: Keeping count of values

Intuition: Since in this case there are only 3 distinct values in the array so it’s easy to maintain the count of all, Like the count of 0, 1, and 2. 
           This can be followed by overwriting the array based on the frequency(count) of the values.
  
  Approach: 

Take 3 variables to maintain the count of 0, 1 and 2.
Travel the array once and increment the corresponding counting variables
( let’s consider count_0 = a, count_1 = b, count_2 = c )

In 2nd traversal of array, we will now over write the first ‘a’ indices / positions in array with ’0’, the next ‘b’ with ‘1’ and the remaining ‘c’ with ‘2’.
Time Complexity: O(N) + O(N)

Space Complexity: O(1)

  
  
**Optimized Approach: 3-Pointer approach**

Intuition: In this approach, we will be using 3 pointers named low, mid, and high. We will be using these 3 pointers to move around the values.
  The primary goal here is to move 0s to the left and 2s to the right of the array and at the same time all the 1s shall be in the middle region 
  of the array and hence the array will be sorted. 
