# Assignment 3: Given user input of number of sides, program decides if the shape is a triangle, quadrilateral,
# or neither. Then, it asks for the value of the highest angle and decides if the triangle is right, obtuse,
# or acute; for the quadrilateral, it decides if it is a parallelogram or a rectangle.

sides = int(input("How many sides does the shape have? "))

if sides == 3:
    print("The shape is a triangle!")
    tri_deg = int(input("How many degrees is the highest angle? "))
    if tri_deg == 90:
        print("It is a right triangle!")
    elif tri_deg > 90:
        print("It is an obtuse triangle!")
    elif tri_deg < 90:
        print("It is an acute triangle!")
    else:
        print("Sorry, I can't determine the type of triangle.")
elif sides == 4:
    print("The shape is a quadrilateral!")
    quad_deg = int(input("How many degrees is the highest angle? "))
    if quad_deg == 90:
        print("It is a rectangle!")
    elif quad_deg > 90:
        print("It is a parallelogram!")
    else:
        print("Sorry, I can't determine the type of quadrilateral.")
else:
    print("Sorry, I can't figure out what type of shape it is.")


