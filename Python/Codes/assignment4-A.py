# Given a number from user input, check if the number is a perfect cube or not.
# Author: Ben Perkins, May 2020.

a = float(input("Enter a number here: "))
x = 0

while (x**3 <= abs(a)):
    if (x**3 == abs(a)):
        print(int(a), " is a perfect cube.")
        break
    else:
        x += 1
        if (x**3 > abs(a)):
            print(a, " is not a perfect cube.")
            break








