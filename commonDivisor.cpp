#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int a, b;
	int out = 0;
	int t;
	cin >> a >> b;
	for (int i = 1; i < ((a > b ? a : b)/2)+1; i++)
	{
		if (a%i == 0 && b%i == 0)
			out++;
	}
	cout << out;
	cin >> t;
}