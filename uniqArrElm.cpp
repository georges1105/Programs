#include <iostream>
#include <conio.h>	

using namespace std;

int main()
{
	int t,n, a[10];
	int count=0;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = i; j < n ; j++)
		{
			if (j == i)
				continue;
			for (int k = j; k < n; k++)
			{
				if (k == i)
					continue;
				if (k == j)
					continue;

				if (a[i] + a[j] + a[k] == 0)
				{
				count++;
				}
			}
		}
	}
	cout << count;
	cin >> t;
	_getch;
	return 0;
}