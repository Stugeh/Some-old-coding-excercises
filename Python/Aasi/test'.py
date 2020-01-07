def test():
    while True:
        valinta = input("Valinnat: q, r, k, t\n")

        if valinta in ['q', 'r', 'k', 't']:
            return valinta
        else:
            print("Virheellinen syöte!")



print(test())
