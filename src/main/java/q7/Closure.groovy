package q7

List list=[1,2,4,7,9]
def contain = {  List x, y-> if(x.contains(y))
    println("True")
else
    println("false")
}


contain(list,5)