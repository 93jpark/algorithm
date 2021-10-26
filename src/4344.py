import sys

n = int(sys.stdin.readline().rstrip())
result = []
for i in range(n):
    scores = list(map(int, sys.stdin.readline().rstrip().split()))
    total_case = scores[0]
    scores = scores[1:]
    total_score, avg = 0, 0
    for j in scores:
        total_score += j
    else:
        avg = total_score / total_case
    count = 0
    for j in scores:
        if j > avg:
            count+=1
    else:
        result.append(count / total_case * 100)
else:
    for i in result:
        print('{:.3f}%'.format(i))
