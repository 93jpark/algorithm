# 백준 4673번
# 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
n = 10000
test_cases = range(1, n)
test_cases = set(test_cases)

for i in range(1, n):
    s = str(i)
    sum = i
    for c in s:
        sum += int(c)
    else:
        if sum < n:
            try:
                test_cases.remove(sum)
            except:
                pass

for i in test_cases:
    print(i)
