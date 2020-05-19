def sort(list):
    for index in range(1, len(list)):
        value = list[index]
        i = index-1
        while i >= 0:
            if value < list[i]:
                list[i+1] = list[i]
                list[i] = value
                i -= 1
            else:
                break
    return (list)

a = []
for i in range(10):
    num = int(input("Enter your number: "))
    a.append(num)
print("Original List", a)
b = sort(a)
print("The sorted list: ", b)

