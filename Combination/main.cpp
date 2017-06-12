#include <iostream>
using namespace std;

int main()
{
    unsigned int n, m;
    unsigned long c, x = 1, y = 1, z = 1;
    do {
        cout << "Set N(5~100): ";
        cin >> n;
        cout << "Set M(5~100): ";
        cin >> m;
        if(n < m)
            cout << "N must be more than M" << endl;
    } while(n < m);

    for(int i = 0, j = n; i < m; i++, j--)
        x *= (long)j;
    for(int i = m; i > 1; i--)
        z *= (long)i;
    c = x/z;

    cout << n <<" things taken " << m << " at a time is " << c << " exactly." << endl;

    return 0;
}
