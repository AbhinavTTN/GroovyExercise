package q8

File outputFile = new File("/home/neelesh/Groovy/8.txt")

new File("/home/neelesh/Groovy/8").eachFile {file->
    outputFile << file.getText()
}