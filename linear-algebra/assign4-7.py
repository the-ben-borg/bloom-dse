import numpy as np
import matplotlib.pyplot as plt

plt.style.use("ggplot")

def f(x):
   return abs(x)

x = np.linspace(-8, 8, 1001)

plt.plot(x, f(x), color="green", linestyle="solid", label="$f(x)$")
plt.plot(x, 1*x, color="red", linestyle="dashed", label="$f(1)$")
plt.plot(x, 1/3*(x), color="blue", linestyle="dashdot", label="$f(2)$")

plt.ylim(-5, 10)
plt.legend()
plt.show()
