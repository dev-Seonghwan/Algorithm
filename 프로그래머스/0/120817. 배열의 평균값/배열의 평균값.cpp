#include <string>
#include <vector>
#include <numeric>
using namespace std;

double solution(vector<int> numbers) {
    return  reduce(numbers.begin(),numbers.end(), 0.0)/ numbers.size();
}