a = []
for i in range(10):
    x = int(input('Enter your number: '))
    a.append(x)
print(a)

max = 0
for i in range(len(a)):
    if a[i]%2 == 1:
        if a[i] > max:
            max = a[i]

if max == 0:
    print("There are no odd numbers entered")
print("The largest odd number entered is: ", max)
