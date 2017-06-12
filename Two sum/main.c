/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
#include <stdio.h>
#include <stdlib.h>

int* twoSum(int* num, int numSize, int target)
{
    int i, j, tmp;
    int *ans;
    numSize;
    for(i = 0; i < numSize - 1; i++) {
        tmp = target - num[i];
        for(j = i + 1; tmp != num[j] && j < numSize; j++);
        if(tmp == num[j])
            break;
    }
    if((num[i] + num[j]) == target) {
        ans = (int*)malloc(2*sizeof(int));
        ans[0] = i;
        ans[1] = j;
        return ans;
    }
    return NULL;
}
void main ()
{
    int num[] = {2, 7, 11, 15};
    int *retArr;
    retArr = twoSum(num, 4, 30);
    if(retArr == NULL) {
        printf("No Target\n");
    } else {
        printf("%d  %d\n", retArr[0], retArr[1]);
        free(retArr);
    }
}

