""""seuraa hahmon liiketta"""
import math


def muunna_xy_koordinaateiksi(olento):
    """laskee koordinaatit"""
    kulma = math.radians(olento["suunta"])
    pituus = olento["nopeus"]
    x_p = round(pituus * math.cos(kulma))
    y_p = round(pituus * math.sin(kulma))
    x_o = olento["x"] + x_p
    y_o = olento["y"] + y_p
    return x_o, y_o


def kysy_liike(olento):
    """tulostaa hahmon x ja y seka paivittaa suunnan ja nopeuden"""
    print("Hahmon x: {}\nHahmon y: {}".format(olento["x"], olento["y"]))
    olento["suunta"] = float(input("Anna liikkumissuunta asteina: "))
    olento["nopeus"] = float(input("Anna liikenopeus: "))


def paivita_sijainti(olento):
    """paivittaa sijainnin"""
    #olento["x", "y"] = muunna_xy_koordinaateiksi(olento)
    x, y = muunna_xy_koordinaateiksi(olento)
    olento["x"] = x
    olento["y"] = y
    print("uusi sijainti: ({}, {})".format(olento["x"], olento["y"]))


hahmo = {
    "x": 0,
    "y": 0,
    "suunta": 0,
    "nopeus": 0
}
