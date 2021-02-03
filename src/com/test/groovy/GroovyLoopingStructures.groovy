package com.test.groovy

//Classic for loop
//Groovy supports the standard Java / C for loop:

String message = ''
for (int i = 0; i < 5; i++) {
	message += 'Hi '
}
assert message == 'Hi Hi Hi Hi Hi '


//for in loop
//The for loop in Groovy is much simpler and works with any kind of array, collection, Map, etc.

// iterate over a range
def x = 0
for ( j in 0..9 ) {
	x += j
}
assert x == 45

// iterate over a list
y = 0
for ( k in [0, 1, 2, 3, 4] ) {
	y += k
}
assert y == 10

// iterate over an array
def array = (0..4).toArray()
z = 0
for ( l in array ) {
	z += l
}
assert z == 10

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]
a = 0
for ( e in map ) {
	a += e.value
}
assert a == 6

// iterate over values in a map
b = 0
for ( v in map.values() ) {
	b += v
}
assert b == 6

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
	list.add(c)
}
assert list == ["a", "b", "c"]
//Groovy also supports the Java colon variation with colons: for (char c : text) {}
//while loop


def p = 0
def q = 5

while ( q-- > 0 ) {
	p++
}
assert p == 5




