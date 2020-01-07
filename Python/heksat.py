"""dsd"""


def muotoile_heksaluvuksi(luku, pituus):
    """ASFAS"""
    try:
        pituus = pituus // 4
        luku = format(luku, 'x').zfill(pituus)
    except ValueError:
        print("Kokonaisluku kiitos")

    return luku

print(muotoile_heksaluvuksi(500, 16))
