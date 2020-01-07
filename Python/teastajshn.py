def surrounding(ninjas, x, y):
    Ns = 0
    for i in range(-1, 2):
        for j in range(-1, 2):
            if ninjas[y + i][x + j] == 'N':
                Ns += 1
    return Ns


ninjas_ = [['N', ' ', ' ', ' ', ' '],
           ['N', 'N', 'N', 'N', ' '],
           ['N', ' ', 'N', ' ', ' '],
           ['N', 'N', 'N', ' ', ' '],
           [' ', ' ', ' ', ' ', ' '],
           [' ', ' ', ' ', ' ', ' ']]

print(surrounding(ninjas_, 0, 0))
