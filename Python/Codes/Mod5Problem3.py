# A program to find out if a number is a perfect square or not.
# Uses a while loop

a = int(input("Enter the number: "))
sq = 0
while (sq <= (a/2)):
    if (sq*sq == a):
        print(sq, "is the square root of", a)
        break
    else:
        sq += 1
        if (sq > a/2):
            print(a, "is not a perfect square")

