# Program to find sum and product of five numbers from user input. It uses Python file reading/writing.
# Author: Ben Perkins | May 2020


def get_filenums():
    num_file = open("NumFile.txt", "w+")
    for i in range(0, 5):
        n = input('Enter a number here: ')
        num_file.writelines(n + '\n')
    num_file.close()

def get_sum():
    sum2 = 0
    file2 = open("NumFile.txt", "r+")
    sum_nums = file2.readlines()
    for n in sum_nums:
        sum2 += int(n)
    print('The sum of your numbers is: ' + str(sum2) + '.')
    file2.close()

def get_prod():
    prod = 1
    file3 = open("NumFile.txt", "r+")
    prod_nums = file3.readlines()
    for m in prod_nums:
        prod *= int(m)
    print('The product of your numbers is: ' + str(prod) + '.')
    file3.close()

get_filenums()
get_sum()
get_prod()