#include <string>
#include <vector>
#include <iostream>

using namespace std;
/*
    프로그래머스
    코딩테스트 연습
    2021 Dev - Matching: 웹 백엔드 개발자(상반기)
    로또의 최고 순위와 최저 순위
    https://programmers.co.kr/learn/courses/30/lessons/77484
*/

//순위 반환
int get_rank(int score)
{
    switch (score)
    {
    case 6:
        return 1;
    case 5:
        return 2;
    case 4:
        return 3;
    case 3:
        return 4;
    case 2:
        return 5;
    default:
        return 6;
    }
}

vector<int> solution(vector<int> lottos, vector<int> win_nums)
{
    //알아 볼 수 없음
    int zero_cnt = 0;
    //맞춤
    int win_cnt = 0;
    vector<int> answer;

    //내 로또의 크기만큼
    for (int i = 0; i < lottos.size(); i++)
    {   
        if (lottos[i] == 0)
        {
            zero_cnt++;
        }
        else
        {   // 0 이 아닐경우 당첨 번호가 있는지 검사
            for (int j = 0; j < win_nums.size(); j++)
            {
                if (lottos[i] == win_nums[j])
                {
                    win_cnt++;
                    break;
                }
            }
        }
    }
    //0이 당첨이라고 가정
    int good_case = get_rank(win_cnt + zero_cnt);
    //맞춘번호만 가정
    int bad_case = get_rank(win_cnt);

    answer.push_back(good_case);
    answer.push_back(bad_case);


    return answer;
}