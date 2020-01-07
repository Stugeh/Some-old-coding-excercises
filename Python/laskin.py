"""laskee"""

def calc():
    """tassa ne sitte lasketaan"""

    op = input("Valitse operaatio (+, -, *, /): ")
    if op in ('+', '-', '*', '/'):
        try:
            luku1 = float(input("Anna luku 1: "))
            luku2 = float(input("Anna luku 2: "))
        except ValueError:
            print("Ei tämä ole mikään luku")

        else:
            if op == '+':
                vastaus = luku1 + luku2
            elif op == '-':
                vastaus = luku1 - luku2
            elif op == '*':
                vastaus = luku1 * luku2
            elif op == '/':
                if luku2 != 0:
                    vastaus = luku1 / luku2
                else:
                    print("Tällä ohjelmalla ei pääse äärettömyyteen")
                    return
            print("Tulos: {}".format(vastaus))
    else:
        print("operaatiota ei ole olemassa")


calc()
