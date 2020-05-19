# Write a program that takes a string as input and prints all possible substrings which are palindromes. So HERE will have 5 palindromes ‘H’, ‘E’, ‘R’, ‘E’ and ‘ERE’. Similarly, HURRY will have 6 palindromes. Return both the list of palindrome substrings as well as the total number.

def sub_pal(orig):
    pal = []
    count = 0
    i = 0
    while (i <= len(orig)):
        for j in range(i, len(orig) + 1):
            new = orig[i:j]
            if new == new[::-1] and new != '':
                pal.append(new)
                count += 1
        i = i + 1
    return (pal, count)

orig = input("Enter your string: ")
pal_list, total_num = sub_pal(orig)
print("The total list of palindromes is: ", pal_list)
print("The total number of palindromes is: ", total_num)

