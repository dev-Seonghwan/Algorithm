#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) 
{
    string answer = "";
    char c = ' ';
    
    for(char word : s)
    {
        if('A'<= word && word <= 'Z')
            c ='A';
        
        else if ('a'<= word && word <= 'z')
            c ='a';
        
        if (word != ' ')
            word = (word + n - c)%26 + c;
        
        answer.push_back(word);
    }
    
    return answer;
}