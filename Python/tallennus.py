"""
tallentaa summat
"""


def tallenna_summat(data, tiedosto):
    """
    funktio
    """
    with open(tiedosto, 'w') as tied:
        for rivi in data:
            tied.write(':'.join(rivi))
            tied.write('\n')
