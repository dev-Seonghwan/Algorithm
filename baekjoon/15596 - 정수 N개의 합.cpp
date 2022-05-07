#include <vector>
#include <iostream>
using namespace std;

long long sum(vector<int>& a)
{
	long long ans = 0;
	for (vector<int>::iterator iter = a.begin(); iter < a.end(); iter++)
	{	ans += *iter;
		cout << &iter <<endl;

	}
	return ans;
}

int main()
{
	vector<int> a;
	a.push_back(1);
	a.push_back(2);
	a.push_back(3);
	a.push_back(4);
	a.push_back(5);

	cout << sum(a);
}