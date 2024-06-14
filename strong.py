def func(arr, N):
	if(N == 1):
		return 1
	counter = 0
	for i in range(N):
		gcd = 0
		for j in range(N):
			if(i == j):
				continue
			else:
				gcd = GCD(gcd, arr[j])
		if(gcd > 1):
			counter += 1
	return counter
def GCD(a, b):
	if(b == 0):
		return a
	else:
		return GCD(b, a % b)
# arr = [3,5,7,11]
arr = [5,10,20]
N = len(arr)
answer = func(arr, N)
print(answer)