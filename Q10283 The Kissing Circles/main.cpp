#include <iostream>
#include <math.h>

#define PI (2.0*acos(0.0))

using namespace std;

int main ()
{
    double R, r, theta;
    int n;
    cout << "Set R(0 <= R <= 10000):";
    cin >> R;
    cout << "Set N(0 <= R <= 100):";
    cin >> n;

    theta = PI/n;
    r = 1 + (1/atan(theta));
    r = R/r;
    cout << r << endl;

    return 0;

}
