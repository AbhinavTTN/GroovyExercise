package q10

File output = new File("/home/neelesh/Groovy/10/output.txt")

new File("/home/neelesh/Groovy/10/input.txt").eachLine { line->

    output<<line.replaceAll("\\s","")
}
