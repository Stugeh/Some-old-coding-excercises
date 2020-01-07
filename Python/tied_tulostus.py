"""
tulostaa tiedostosta
"""


def nayta_tulokset(tiedosto):
    """
    tulostaa tulokset tiedostosta
    """
    with open(tiedosto, 'r') as source:
        for line in source:
            lista = line.rstrip().split(',')
            print("{} {} - {} {}".format(lista[0], lista[2], lista[3], lista[1]))
