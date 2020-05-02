'''
Demonstrate nested ifs and multi-line comments
The Python documentation actually defines the triple-quotes for writing Docstrings, not multi-line comments.
'''

item = (input(" Enter whether it is a fruit or a vegetable "))
color = (input(" Enter the color "))

if item == 'fruit':
    if color == 'Red':
        print(" You have an Apple")
    elif color == 'Yellow':
        print(" You have a banana")
    elif color == 'Orange':
        print(" You have an Orange")
    else:
        print(" We could not identify the fruit, sorry")
elif item == 'vegetable':
    if color == 'Red':
        print(" You have a Tomato")
    elif color == 'Green':
        print(" You have a Bell Pepper")
    elif color == 'Yellow':
        print(" You have Corn")
    else:
        print(" We could not identify the vegetable, sorry")
else:
    print(" Please choose either fruit or vegetable")
