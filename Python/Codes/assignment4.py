# Given a number from user input, check if the number is a perfect cube or not.

a = int(input("Enter a number here: "))
dr = a % 9
if (dr == 0):
    print(a, " is a perfect cube.")
elif (dr == 8):
    print(a, " is a perfect cube.")
elif (dr == 2):
    print(a, " is a perfect cube.")
else:
    print(a, " is not a perfect cube.")





