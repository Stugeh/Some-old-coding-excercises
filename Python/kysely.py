"""A"""


def pyyda_syote(prompt, errr):
    """"d"""
    while True:
        try:
            syote = int(input(prompt))
        except:
            print(errr)
        else:
            if syote > 1:
                return syote
            print(errr)


def tarkista_alkuluku(luku):
    """palauttaa true jos luku on alkuluku"""
    for i in range(2, luku-1):
        remainder = luku % i
        if remainder == 0:
            return False
    return True
