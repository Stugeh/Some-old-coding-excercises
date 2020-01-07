"""piirtää spiraaleja"""
from turtle import *


def piirra_spiraali(colr, arches, radi, growth, thiccness=1):
    """piirtaa ne spiraalit"""
    color(colr)
    pensize(thiccness)
    for i in range(arches):
        circle(radi, 90)
        radi = radi + growth

piirra_spiraali("black", 20, 10, 3)
piirra_spiraali("red", 10, 20, 4, 3)
piirra_spiraali("blue", 10, -20, -4, 3)
done()
