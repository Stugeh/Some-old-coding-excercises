import aasigotchi.aasikaytto as kayt
import aasigotchi.aasilogiikka as log
import aasigotchi.aasimaaritelmat as maar

def main():
    aasidata = aasilogiikka.alusta()
    
    while True:
        aasikaytto.nayta_tila(aasidata)
        syote = aasikaytto.pyyda_syote(aasidata)
        
        if syote == aasimaaritelmat.LOPETA:
            break
        elif syote == aasimaaritelmat.RUOKI:
            aasilogiikka.ruoki()
        elif syote == aasimaaritelmat.KUTITA:
            ???
        elif syote == aasimaaritelmat.TYOSKENTELE:
            ???
        elif syote == aasimaaritelmat.ALUSTA:
            ???

if __name__ == "__main__":
    ???