package com.test.groovy

// better to use def
	name1 = "Alok Barman"
	println name1
	def name = "Alok Barman"
	println name
	
	println 'Name is ${name}'
	println "Hello, ${name}"
	
	def x = 10;
	def y = 20
	println x+y
	//Groovy is dynamic typing language
	def str = "Alok"
	str = 10
	println str
	
	def(a,b,c) = [30, 40, 50]
	println a
	println b
	println c
	
	def(String m, int n, double p) = [30, 40, 50]
	println m
	println n
	println p

