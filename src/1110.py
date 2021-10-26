# 백준 1110번
# 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
# 첫째 줄에 N의 사이클 길이를 출력한다.
import sys
n = int(sys.stdin.readline().strip())
count, flag = 0, True
m = n

while flag:
    a = m // 10
    b = m % 10
    x = (a + b) % 10
    m = b * 10 + x
    count += 1
    if m == n:
        flag = False
else:
    print(count)