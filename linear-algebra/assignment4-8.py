import numpy as np
import matplotlib.pyplot as plt
import math as math

plt.style.use('ggplot')

def f(x):
    return math.exp(-x**2)

x = np.linspace(-5, 5, 1001)

plt.plot(x, f(x), color="red", linestyle="solid", label="$f(x)=e^-x^2$")


plt.legend()
plt.show()

