import numpy as np
import matplotlib.pyplot as plt
plt.style.use('ggplot')

def slope(x0, x1, y0, y1):
    return (y1 - y0) / (x1 - x0)

def f(x):
    return (2*x)**3 - (3*x)**2 + 9

def secant(m, b):
    return m*x + b


x = np.linspace(-5, 5, 101)

plt.plot(x, f(x), color="blue", linestyle="dashdot", label="$f(x)= 2x^3-3x^2+9$")
plt.plot(0, 9, 'o', color="brown", label="$(0,9)$")
plt.plot(1, 8, 'o', color="green", label="$(1,8)$")
plt.plot(x, secant(-1, 9), color="red", linestyle="dotted", label="secant to $f(x)$ with slope equal to $-1$")
plt.ylim(-2, 15)
plt.legend()
plt.show()

print("Slope is equal to: ", slope(0, 1, 9, 8))