class HelloWorld {

	static main(args) {
		defMethod()
		println "----------"
		forIterator()
	}
	
	static void defMethod() {
		def message = "Hello World"
		println message.class
	}
	
	static void forIterator() {
		for (def x = 0; x < 5; x++)
			println x
	}

}
