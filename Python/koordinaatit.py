"""koordinaatteja"""
import math


def muunna_xy_koordinaateiksi(kulma, pituus):
    """laskee koordinaatit"""
    x_p = round(pituus * math.cos(kulma))
    y_p = round(pituus * math.sin(kulma))
    print("x: %d  y: %d" % (x_p, y_p))
    return x_p, y_p


muunna_xy_koordinaateiksi(float(input("syota kulma: ")), float(input("syota pituus: ")))
