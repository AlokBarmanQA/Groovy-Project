package com.test.groovy

def printHello() {
	println "Hello...."
}
printHello()

def sum(a,b) {
	println "Sum is "+(a+b)
}
sum(10, 15)

def sum2(c=20, d=20) {
	println "Sum is "+(c+d)
}
sum2()

def sub(int a, int b) {
	def c = a-b
	return c
}
def result = sub(50, 20)
println "Result is " +result
