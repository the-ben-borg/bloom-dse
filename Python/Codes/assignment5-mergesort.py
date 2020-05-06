test_listA = [2, 6, 1, 10, 9, 1, 0, 91]
test_listB = [-2, -9, 9, 1, 0, 11, -12]

def merge_sort (list):

    if len(list) > 1:
        middle = len(list)//2
        lft = list[:middle]
        rgt = list[middle:]

        merge_sort(lft)
        merge_sort(rgt)

        i = 0
        j = 0
        k = 0

        while i < len(lft) and j < len(rgt):
            if lft[i] < rgt[j]:
                list[k] = lft[i]
                i = i + 1
            else:
                list[k] = rgt[j]
                j = j + 1
            k = k + 1

        while i < len(lft):
            list[k] = lft[i]
            i = i + 1
            k = k + 1

        while j < len(rgt):
            list[k] = rgt[j]
            j = j + 1
            k = k + 1

    return list

print("Starting List: ", test_listB)
print("Result List: ", merge_sort(test_listB))



