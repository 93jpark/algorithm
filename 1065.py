# 백준 1065번
# 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
# 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
# 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
# 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.


import sys

n = int(sys.stdin.readline().strip())
count = 0
for i in range(1, n+1):
    s = str(i)
    c_list = []
    for c in s:
        c_list.append(int(c))
    else:
        if len(c_list) < 2:
            count += 1
        else:
            diff = [c_list[0] - c_list[1], True] # 3
            for x in range(1, len(c_list)-1):
                new_diff = c_list[x]-c_list[x+1]
                if new_diff != diff[0]:
                    diff[1] = False
            else:
                if diff[1]:
                    count+=1
print(count)