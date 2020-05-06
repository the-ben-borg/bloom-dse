data_list = []
n = int(input("Enter the number of items in the list: "))
for i in range(n):
    t = int(input("Enter a number: "))
    data_list.append(t)
print(data_list)
new_list = []

while data_list:
    min = data_list[0]
    for x in data_list:
        if x < min:
            min = x
    new_list.append(min)
    data_list.remove(min)

print(new_list)