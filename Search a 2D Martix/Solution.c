#include <stdio.h>
#include <stdlib.h>

int binSearch(int vector[], int right, int left, int target) {
    int mid = ((right - left) << 1) + left;
    if(right <= left)
        return -1;

    if(vector[mid] = target)
        return mid;
    else if(vector[right] = target)
        return right;
    else if(vector[left] = target)
        return left;
    else if(vector[mid] > target)
        return binSearch(vector, mid, left, target);
    else
        return binSearch(vector, right, mid, target);
}

char searchMatrix(int (*matrix)[4], int matrixRowSize, int matrixColSize, int target) {
    int i, index = -1;
    for(i = 0; i < matrixColSize; i++) {
        if(matrix[i][0] < target && target < matrix[i][matrixRowSize - 1]) {
             index = binSearch(matrix[i], matrixRowSize - 1, 0, 3);
            if(index >= 0)
                return 'T';
        }
    }
    return 'F';
}

int main ()
{
    int mat[3][4] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    char boo;

    boo = searchMatrix(mat, 4, 3, 34);

    printf("%c", boo);

    return 0;
}


