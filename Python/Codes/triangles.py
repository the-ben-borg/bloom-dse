def asterisk_triangle(n):
    x = 1
    while (x <= n):
        print("*" * x)
        x = x + 1
    return

def inverse_triangle(n):
    x = n
    while (x > 0):
        print("*" * x)
        x = x - 1
    return

def recursive_asterisk_triangle(i, t = 0):
    if i == 0:
        return 0
    else:
        print(' ' * (i + 1) + '*' * (t * 2 + 1))
        return recursive_asterisk_triangle(i - 1, t + 1)

def upside_down_asterisk_triangle(i, t = 0):
    if i ==0:
        return 0
    else:
        print(' ' * (t + 1) + '*' * (i * 2 - 1))
        return upside_down_asterisk_triangle(i - 1, t + 1)

n = int(input("Enter the max number of asterisks you want: "))
asterisk_triangle(n)
print("-----------------------------------------")
inverse_triangle(n)
print("-----------------------------------------")
recursive_asterisk_triangle(n)
print("-----------------------------------------")
upside_down_asterisk_triangle(n)

