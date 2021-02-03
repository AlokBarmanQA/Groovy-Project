package com.test.groovy
//https://groovy-lang.org/semantics.html
//1.3.1. Conditional structures if / else
def x = false
def y = false

if ( !x ) {
	x = true
}

assert x == true

if ( x ) {
	x = false
} else {
	y = true
}

assert x == y

//switch / case
def m = 1.23
def result = ""

switch ( m ) {
	case "foo":
		result = "found foo"
		// lets fall through

	case "bar":
		result += "bar"

	case [4, 5, 6, 'inList']:
		result = "list"
		break

	case 12..30:
		result = "range"
		break

	case Integer:
		result = "integer"
		break

	case Number:
		result = "number"
		break

	case ~/fo*/: // toString() representation of x matches the pattern?
		result = "foo regex"
		break

	case { it < 0 }: // or { x < 0 }
		result = "negative"
		break

	default:
		result = "default"
}

assert result == "number"