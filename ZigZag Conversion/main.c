/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
#include <stdio.h>
#include <stdlib.h>
char* convert(char* s, int numRows)
{
    char* retS;
    int i, j, k, mid, len, c;
    retS = (char*)malloc(32*sizeof(char));
    mid = (numRows - 1)/2;
    // get size
    for(i = 0; s[i] != '\0'; i++);
    len = i;
    for(i = 0, k = 0; i < numRows; i++) {
        if(i == mid) {
            for(j = i; j < len; j += (numRows + 1)/2)
                retS[k++] = s[j];
        } else {
            for(j = i; j < len; j += (numRows + 1))
                retS[k++] = s[j];
        }
    }
    retS[k] = '\0';
    return retS;
}
void main ()
{
    char *str = "PAYPALISHIRING", *ans;

    ans = convert(str, 5);
    printf("%s", ans);

    free(ans);
}
