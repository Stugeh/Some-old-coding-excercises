from turtle import *

def piirra_ympyra(x, y, sade):
    up()
    setx(x)
    sety(y-sade)
    down()
    begin_fill()
    circle(sade)
    up()
    setx(x)
    sety(y)





piirra_ympyra(50, 50, 30)
up()
setx(50)
sety(50)
done()

#forward(x)
#left(a)
#right(a)
#color(c)
#begin_fill()
#end_fill()
#reset()
#done()
# up()
# down()
# setx(x)
# sety(y)
# circle(r)