// groovy脚本中不需要类似于java中的package和class
def repeat(val){
	for(i = 0; i < 5; i++){
		println val
	}
}

def repeat2(val){
	for(i in 0..<5){
		println val
	}
}

def repeat3(val, repeat=5){
	for(i in 0..<repeat){
		println val
	}
}



repeat3 "hello world", 2

