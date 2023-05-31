def reverseString (str : String) : String = {
	// Unlike regular string concatenation using the + operator or += operator, which creates a new string object every time, StringBuilder allows you to efficiently append or modify strings without creating unnecessary intermediate string objects.
	val builder = new StringBuilder(str.length)

  	for (i <- str.length - 1 to 0 by - 1) {
       	builder.append(str(i))    
    }
  
    builder.toString()
}

println(reverseString("loop"))