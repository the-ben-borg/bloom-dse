# Program by Ben Perkins
# Gather user input for five numbers, calculate sum and product of the list of numbers.

def get_nums():
    nums = []
    for i in range(0, 5):
        n = input('Enter a number here: ')
        n = int(n)
        nums.append(n)
    return nums

def get_sum(num_list):
    sum1 = 0
    for b in num_list:
        sum1 += b
    print('The sum of your numbers is: ' + str(sum1) + '.')

def get_prod(num_list):
    prod = 1
    for i in num_list:
        prod *= i
    print('The product of your numbers is: ' + str(prod) + '.')

numbers = get_nums()

get_sum(numbers)
get_prod(numbers)





