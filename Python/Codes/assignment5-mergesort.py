orig_list = [2, 6, 1, 10, 9, 1, 0, 91]

def merge_sort (list):
    if (len(list) <= 1):
        return list

    l = []
    r = []

    for x in list:
        i = list.index(x)
        if i < (len(list))/2:
            l.append(x)
        else:
            r.append(x)

    l = merge_sort(l)
    r = merge_sort(r)

    return l + r

print(merge_sort(orig_list))
