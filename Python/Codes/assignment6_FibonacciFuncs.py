# Recursive function to print first 8 Fibonacci numbers
seqa = []

def fib(n):
    if (n <= 2):
        seqa.append(1) 
    else:
        f = (fib(n-1) + fib(n-2))
        seqa.append(f)
        return f
    


# Iterative function to print first 8 Fibonacci numbers

def fibonacci_loop(n):
    a = 0
    b = 1
    sum = 1

    seq = []
    seq.append(a)
    seq.append(b)
    for i in range(n-2):
        term = a + b
        a = b
        b = term
        seq.append(term)
        sum += term
    print ("Fibonacci Loop series: ", seq)


fibonacci_loop(8)
fib(8)
print(seqa)
