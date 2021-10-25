def gcd_for(a, b):
    i = min(a,b)
    while True:
        if a % i == 0 and b % i == 0:
            return i
        i = i - 1

def gcd_eucd(a,b):
    if b == 0:
        return a
    return gcd_eucd(b, a%b)


print(gcd_for(1, 5))
print(gcd_for(3,9))
print(gcd_for(81, 27))

print(gcd_eucd(3, 9))
print(gcd_eucd(81, 27))