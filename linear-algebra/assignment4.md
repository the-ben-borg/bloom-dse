## Assignment 4 - Derivatives
#### Ben Perkins
##### June 2020

> 7 - Write a Python program to plot the secant lines of  $\left|x\right|=\begin{cases}
x&\text{for }x\ge 0\,;\\
-x&\text{for }x\le 0\,.\\
\end{cases}$ 
>passing through $\left(0,0\right)( 0 , 0 )$ and some points close to $\left(0,0\right)( 0 , 0 )$. Compute their slopes, and summarize your observations in a table. Do you get a tangent line at $\left(0,0\right)( 0 , 0 )$? Why or why not? Give the derivative at $\left(0,0\right)( 0 , 0 )$, if it exists.
>
***
```python
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
```
![Plot of abs(x) with secant lines at f(1) & f(2)](Figures/assignment4-abs(x)-7.png "abs(x)")
***

||**Tangent Line**|**Secant Line**|
|:-------------|:----------:|:---------:|
|**Approximation**|Closely approximates the circle|Does not closely approximate the circle|
|**Intersection** |Touches the curve once|Touches the curve on half of its points.|
|**Sides**        |The whole curve is on one side of it.|The curve comprises half of $f(1)$.|
|**Example**      |$y=1$|$x$-axis & $y$-axis|


- The line at $(0,0)$ with $x=2$ is tangent to the curve. This is because the value of $b$, the $y$-intercept, in the line's equation is $0$.
- The **derivative** at $(0,0)$ is 1.


***
> 8 - Write a Python program to plot the secant lines of $e^{-x^2}$ passing through $\left(0,0\right)( 0 , 0 )$ and some points close to $\left(0,1\right)( 0 , 1 )$.  Compute their slopes, and summarize in a table. Do you get a tangent line at $\left(0,1\right)( 0 , 1 )$? Why or why not? Give the derivative if it exists.


