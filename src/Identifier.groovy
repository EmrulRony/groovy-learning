// Identifier and Variable
println '-->variable'
def x = 5
def y = 10
println 'result:' + x + y
// Groovy Loops
println '-->loops'
0.upto(4) { println("$it") }

println '-->list'
def myList = ['Glory', 'Glory', 'Manchester', 'United']
myList.add('Football')
println myList.contains('Glory')
myList.each { item -> println item }

println '-->Map'
def student = [1: 'Emrul', 2: 'Hasan', 3: 'Khan']
student.each {
    println it.key
    println it.value
}

println '-->Closures' // similar as functions/methods
def myClosure = {
    println 'This is a sample closure'
}
myClosure()

def closureWithArguments = { a, b -> println a + b }
closureWithArguments 10, 20

def closureReturningValue = {
    i, j, k ->
        def result = i + j + k
        return result
}
println closureReturningValue(2, 2, 2)

def callBackClosure = {
    msg -> println 'Emrul ' + msg
}

def greetings = {
    Closure closure ->
        println 'Groovy'
        closure 'Hello'
        println 'Is good'

}

greetings callBackClosure

