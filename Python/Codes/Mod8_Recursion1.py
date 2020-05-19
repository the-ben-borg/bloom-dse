# Write a program that takes an input from the user and prints the value of its factorial. So if the user gives 5 as
# input, the program should give 120 as output.

def fac(n):
    if n == 1:
        return 1
    else:
        return n*fac(n-1)

x = int(input("Enter your number: "))
print("The value of the factorial of " + str(x) + " is: ", fac(x))
