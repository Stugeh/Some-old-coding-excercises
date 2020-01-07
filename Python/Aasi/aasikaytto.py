"""
syotteet ja tulostukset
"""


def nayta_tila(aasidata):
    """
    Tulostaa aasin tilan.
    """
    print("Aasi on {} vuotta vanha ja rahaa on {} mk.".format(aasidata["IKÄ"], aasidata["RAHA"]))
    print("Kylläisyys: ", aasidata["KYLLÄISYYS"])
    print("Onnellisuus: ", aasidata["ONNELLISUUS"])
    print("Jaksaminen: ", aasidata["JAKSAMINEN"])
    if aasidata["ELÄKE"]:
        print("Aasi on jäänyt eläkkeelle.")


def pyyda_syote(aasidata):
    """
    Näyttää käyttäjälle aasin tilaa vastaavat mahdolliset syötteet ja kysyy uutta
    syötettä kunnes käyttäjä antaa laillisen syötteen. Saatu syöte palautetaan.
    """
    if aasidata["ELÄKE"]:
        print("Valinnat: q, a")
        while True:
            valinta = input()
            if valinta in ['q', 'a']:
                return valinta
            print("Virheellinen syöte!")
    else:
        print("Valinnat: q, r, k, t")
        while True:
            valinta = input()
            if valinta in ['q', 'r', 'k', 't']:
                return valinta
            print("Virheellinen syöte!")
