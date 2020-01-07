"""ss"""
import math


def laske_pituus(jana):
    """ss"""
    x_0 = jana[0]
    y_0 = jana[1]
    x_1 = jana[2]
    y_1 = jana[3]
    x_tot = x_1 - x_0
    y_tot = y_1 - y_0
    x_y = x_tot ** 2 + y_tot ** 2
    # if xy > 0:
    return math.sqrt(x_y)
    # else:
    #     return -sqrt(xy)


janat = [[1, 2, 3, 4], [1, 1, 10, 10], [0, 0, 2, 0]]
janat.sort(key=laske_pituus)
print(janat)