package com.test.groovy

def myClosures1 = {println "Hello World"}
myClosures1.call()

def myClosures2 = {name -> println "Hello ${name}"}
myClosures2.call("Alok")

def str = "Hello"
def myClosures3 = {name -> println "$str ${name}"}
myClosures3.call("Alok")

def myMethod(clos) {
	clos.call("Groovy")
}
myMethod(myClosures3)

def myClouser4 = {a,b,c -> return (a+b+c)}
def res = myClouser4(10,30,60)
println res