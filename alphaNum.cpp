#include <iostream>
#include <stdio.h>
#include <conio.h>

using namespace std;

int main()
{
	char in[10];
	char arr[10];
	int num = 0;
	int j,t;
	int count = 0;
	cin>>in;

	for (int i = 0; in[i] != '\0'; i++)
	{
		if ((in[i] - '0') >= 0 && (in[i] - '0') <= 9)
		{
			num = num * 10 + (in[i] - '0');
			if ((in[i+1] - '0') >= 0 && (in[i+1] - '0') <= 9)
				continue;
			for (j = 0; j < num; j++)
				for(int k = 0 ; k < count ; k++)
				cout << arr[k];
			for (j = 0; j < count; j++)
				arr[j] = '\0';
			count = 0;
			num = 0;
		}
		else
		{
			arr[count] = in[i];
			count++;
		}
	}
	cin >> t;
	return 0;
}