#include <string>
#include <vector>
#include <iostream>

using namespace std;
/*
    ���α׷��ӽ�
    �ڵ��׽�Ʈ ����
    2021 Dev - Matching: �� �鿣�� ������(��ݱ�)
    �ζ��� �ְ� ������ ���� ����
    https://programmers.co.kr/learn/courses/30/lessons/77484
*/

//���� ��ȯ
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
    //�˾� �� �� ����
    int zero_cnt = 0;
    //����
    int win_cnt = 0;
    vector<int> answer;

    //�� �ζ��� ũ�⸸ŭ
    for (int i = 0; i < lottos.size(); i++)
    {   
        if (lottos[i] == 0)
        {
            zero_cnt++;
        }
        else
        {   // 0 �� �ƴҰ�� ��÷ ��ȣ�� �ִ��� �˻�
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
    //0�� ��÷�̶�� ����
    int good_case = get_rank(win_cnt + zero_cnt);
    //�����ȣ�� ����
    int bad_case = get_rank(win_cnt);

    answer.push_back(good_case);
    answer.push_back(bad_case);


    return answer;
}