def solution(lottos, win_nums):
    answer = []
    w_count = 0
    z_count = 0
    rank = [6,6,5,4,3,2,1]
    
    for i in lottos:
        if i == 0:
            z_count += 1
        elif i in win_nums:
            print(i)
            w_count += 1

    answer.append(rank[z_count+w_count] )
    answer.append(rank[w_count] )

    return answer
