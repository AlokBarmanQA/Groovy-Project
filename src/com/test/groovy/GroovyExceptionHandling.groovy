package com.test.groovy
//Try catch with finally
def z
try {
	def i = 7, j = 0
	try {
		def k = i / j
		assert false        //never reached due to Exception in previous line
	} finally {
		z = 'reached here'  //always executed even if Exception thrown
	}
} catch ( e ) {
	assert e in ArithmeticException
	assert z == 'reached here'
}
// Single catch
try {
	'moo'.toLong()   // this will generate an exception
	assert false     // asserting that this point should never be reached
} catch ( e ) {
	assert e in NumberFormatException
}
// Multi catch
try {
/* ... */
} catch ( IOException | NullPointerException e ) {
/* one block to handle 2 exceptions */
}
