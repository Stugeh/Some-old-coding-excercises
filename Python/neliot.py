"""neliot"""
from turtle import *

def piirra_nelio(sivu, x, y):
   """piirtaa punaisen nelion jos x<0 muuten sininen"""
   up()
   setx(x)
   sety(y)
   down()
   if x < 0:
      color("red")
   else:
      color("blue")
   begin_fill()
   forward(sivu)
   right(90)
   forward(sivu)
   right(90)
   forward(sivu)
   right(90)
   forward(sivu)
   end_fill()


piirra_nelio(40, -100, 100)
piirra_nelio(60, 100, -100)
piirra_nelio(100, -50, -20)
piirra_nelio(80, 90, 30)
done()

