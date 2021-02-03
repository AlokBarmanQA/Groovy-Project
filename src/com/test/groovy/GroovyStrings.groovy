package com.test.groovy
//String								Multiline			Interpolation
//Single quoted '...'					
//double quoted "..."										Y
//triple single quoted '''....'''		Y
//triple double quoted """..."""		Y					Y
//slashy /..../							Y					Y
//dollar slashy $/..../$				Y					Y
def name = 'Groovy'
println name
def name1 = "Groovy"
println name1
println "I am learning "+name1
//Interpolation
println "I am learning ${name}"
println 'I am learning ${name}'
// Multiline
def s = """This is a Groovy class
	and we are learning Strings"""
println s
def s1 = '''This is a Groovy class
	and we are learning Strings'''
println s1

def name2 = "Alok"
println name2.length()
println name2[1]
println name2[-2]
println name2.indexOf('k')
println name2[0..2]
println name2[0,2,3]
println name2.substring(2)
println name2.subSequence(1, 3)
def string = "This is a groovy class"
println string.split(" ")
println string-("groovy")
println string.replace("class", "session")
println string.toUpperCase()
println string.toLowerCase()
println string.toList()
println "Groovy "*3
println "ABC".equalsIgnoreCase("abc")

def s2 = /alok kumar barman/
def s3 = $/alok kumar barman/$
println s2
println s3
def name4 = "Hello"
def s4 = /${name4} alok kumar barman/
def s5 = $/${name4} alok kumar barman/$
println s4
println s5

