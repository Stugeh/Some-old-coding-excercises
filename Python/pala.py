"""laskee kuvion alan"""
import math


def laske_kuvion_ala(nel_sivu):
    """laskee kuvion alan"""

    #laskee ylaosan
    n_s = nel_sivu ** 2 + (45 / 360 * math.pi * nel_sivu ** 2 / 2)
    yla = n_s + nel_sivu ** 2 / 4

    #laskee alaosan
    n_y = 2 * nel_sivu ** 2 + math.pi * 2 * nel_sivu ** 2
    ala = n_y - (90 / 360 * math.pi * 2 * nel_sivu ** 2)

    print(round(yla + ala, 4))
    return yla + ala


laske_kuvion_ala(float(input("Anna x: ")))
