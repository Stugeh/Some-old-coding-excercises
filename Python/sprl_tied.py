from turtle import *


def piirra_spiraali(colr, arches, radi, growth, thiccness=1):
    """piirtaa ne spiraalit"""
    color(colr)
    pensize(thiccness)
    for i in range(arches):
        circle(radi, 90)
        radi = radi + growth


def piirra_tiedostosta(tiedosto):
    with open(tiedosto, 'r') as source:
        for line in source:
            col, arch, r, grow, thick = line.rstrip().split(',')
            arch = int(arch)
            r = int(r)
            thick = int(thick)
            grow = float(grow)
            print(col, arch, r, grow, thick)
            print(type(arch))
            piirra_spiraali(col, arch, r, grow, thick)


done()
