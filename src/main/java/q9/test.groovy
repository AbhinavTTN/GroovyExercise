package q9

File output = new File("/home/neelesh/Groovy/9/output.txt")

int flag=1
new File("/home/neelesh/Groovy/9/input.txt").eachLine { line->
    if(flag%2!=0){
        output << flag+" "+line+ "\n"
    }
    flag++
}