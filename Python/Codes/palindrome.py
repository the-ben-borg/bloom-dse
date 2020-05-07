word = input("Enter your word here: ")

n = len(word)

if n <= 1:
    print("It's a palindrome!")
else:
    while (n > 1):
    if (word[0] != word[n-1]):
        print("It's not a palindrome!")
    else:
        word.pop()
