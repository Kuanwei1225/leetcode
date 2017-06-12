/**
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

Subscribe to see which companies asked this question
*/

#include <stdio.h>
int removeDuplicates(int* nums, int numsSize)
{
    int i, tmp, len;
    tmp = nums[0];
    for(i = 1, len = 1; i < numsSize; i++) {
        if(tmp != nums[i]) {
            tmp = nums[i];
            nums[len++] = tmp;
        }
    }
    return len;
}
void main()
{
    int arr[] = {1, 1, 2, 3, 5, 5, 7, 8, 9, 9, 9, 10};
    int len, i;

    len = removeDuplicates(arr, 6);
    for(i = 0; i < len; i++) {
        printf("%d  ", arr[i]);
    }
    printf("\n");
}
