# A program to find the nth term of the Fibonacci series, obtaining n from user input; print the sum of the series up
# to n.

a = 0
b = 1
sum = 1
n = int(input("Enter the value of n: "))
seq = []
seq.append(a)
seq.append(b)
for i in range(n-2):
    term = a + b
    a = b
    b = term
    seq.append(term)
    sum += term
print (seq)
print("The nth term of the sequence is: ", term)
print("The sum till the nth term is: ", sum)
