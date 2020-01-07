"""suodattaja"""

def suodata_virhearvot(tulokset, raja):
    """
    suodattaa rajaarvoa suuremmat luvut pois listasta
    """
    for mittaus in tulokset[:]:
        if mittaus > raja:
            tulokset.remove(mittaus)
