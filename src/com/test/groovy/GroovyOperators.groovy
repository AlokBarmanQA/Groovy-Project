package com.test.groovy
//https://groovy-lang.org/operators.html
//1. Arithmetic operators
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8
println 9.intdiv(5)
print 2.2.plus(1.1)
//1.2. Unary operators
def a = 2
def b = a++ * 3
println b
assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

def e = 1
def f = ++e + 3

assert e == 2 && f == 5

def g = 4
def h = --g + 1

assert g == 3 && h == 4
//1.3. Assignment arithmetic operators
def a1 = 4
a1 += 3

assert a1 == 7

def b1 = 5
b1 -= 3

assert b1 == 2

def c1 = 5
c1 *= 3

assert c1 == 15

def d1 = 10
d1 /= 2

assert d1 == 5

def e1 = 10
e1 %= 3

assert e1 == 1

def f1 = 3
f1 **= 2

assert f1 == 9
//2. Relational operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2
//3. Logical operators
assert !false
assert true && true
assert true || false
