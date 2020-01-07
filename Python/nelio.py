"""nelioita"""

def laske_nelion_ala(syote):
    """laskee nelion alan"""
    ala = syote ** 2
    print(round(ala, 4))
    return ala


laske_nelion_ala(float(input("syota sivun mitta: ")))
