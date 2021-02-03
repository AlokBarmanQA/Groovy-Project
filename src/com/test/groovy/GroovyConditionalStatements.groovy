package com.test.groovy
//https://groovy-lang.org/semantics.html
// Control Structures: if-else & switch-case
//1.1. Variable definition
String x
def y
var z
//1.2. Variable assignment
x = 1
println x

x = new java.util.Date()
println x

x = -3.1499392
println x

x = false
println x

x = "Hi"
println x
//1.2.1. Multiple assignment
def (a, b, c) = [10, 20, 'foo']
assert a == 10 && b == 20 && c == 'foo'
//You can provide types as part of the declaration if you wish:

def (int i, String j) = [10, 'foo']
assert i == 10 && j == 'foo'
//As well as used when declaring variables it also applies to existing variables:

def nums = [1, 3, 5]
def a1, b1, c1
(a1, b1, c1) = nums
assert a1 == 1 && b1 == 3 && c1 == 5
//The syntax works for arrays as well as lists, as well as methods that return either of these:

def (_, month, year) = "18th June 2009".split()
assert "In $month of $year" == 'In June of 2009'
//1.2.3. Object destructuring with multiple assignment
double latitude
double longitude

double getAt(int idx) {
	if (idx == 0) latitude
	else if (idx == 1) longitude
	else throw new Exception("Wrong coordinate index, use 0 or 1")
}
