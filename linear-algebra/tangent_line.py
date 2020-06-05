import numpy as np
import matplotlib.pyplot as plt
plt.style.use("ggplot")


def gee(x):
    return x**2

def secant(x0, x1, y0, y1):
    return (x1-x0)/(y1-y0)*x + 0

def tang(x):
    return 4*x + 1

x = np.linspace(-6, 6, 1001)
plt.plot(x, gee(x), color="green", linestyle="solid", label="$g(x) = x^2$")
plt.plot(x, secant(x, x+2, gee(x), gee(x)+2), color="red", linestyle="dashdot", label="secant at $x1=2$")
plt.plot(x, secant(x, x+4, gee(x)+2, gee(x)+4), color="blue", linestyle="dashed", label="secant at $x1=4$")
plt.plot(x, secant(x, x+6, gee(x)+4, gee(x)+6), color="orchid", linestyle="dotted", label="secant at $x1=4$")
plt.plot(x, (4*x)-4, color="black", linestyle="dashdot", label="tangent at $x=2$")
plt.ylim((-10, 10))
plt.legend()
plt.show()
