//Primitive scalar
let username = "fred"
let age = 50

let numlist = [1,2,3,4,5]

//function type
// anonymous functions, lamda
let greetings = function(name){ console.info(`${username}`)}

let fred = { name:'fred', age:50}

// function greetings(name)
// {
//     console.info ("Hello ${username}")
// }

console.info (`name ${username}, age: ${age}`)
console.info ('numlist', numlist)
console.info('fred', fred)

greetings(username)
let hello = greetings
hello()