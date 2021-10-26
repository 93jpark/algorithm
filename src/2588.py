# 백준 2588번
# 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
# 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

x = input()
y = input()

result = []
fin_result = 0

for i in range(0, len(y)):
    calc = int(x) * int(y[i])
    result.append(calc)
else:
    for i in range(0, len(result)):
        temp = result.pop()
        print(temp)
        fin_result += (temp*(10**i))
    else:
        print(fin_result)