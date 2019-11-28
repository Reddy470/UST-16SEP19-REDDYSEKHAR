console.log('Array method4')
const states = ['AP','KS','TN','USA']
const isArrayOrNot3 = Array.isArray(states)
console.log('states array or not',isArrayOrNot);
console.log('========================')

console.log('Array method2')
const hasAP = states.includes('AP');
console.log('using includes method',hasAP);

console.log('Array method3')
states.push('telgana','goa')
console.log('After push Method',states)

console.log('Array method4')
states.pop()
console.log('After pop Method',states)

console.log('Array method5')
states.unshift('assam','kerala');
console.log('After Unshift method',states)

console.log('Array method6')
states.shift()
console.log('After shift method',states)

console.log('Array method7')
const states1 =['tripura','sikkim','punjab','manipur']
states1.splice(1,2,'capitals','places')
console.log('After Splice Method',states1);


console.log('Array method8')
const aftersliceA = states1.slice(2,4)
console.log('After Slice Method',aftersliceA)

console.log('Array method9')
const indexOfCodingA = names1.indexOf('sikkim',2)
console.log('Index Of Coding', indexOfCodingA);

console.log('Array method10')

const stringStates1 = names1.join('-')
console.log('String Names',stringStates1);

console.log('Array method11')
const numbersA =['AB','BC','CD','ED']
 const numA = numbersA.map(function(value,index){
    let newvalue = value+50
    return newvalue
})
console.log('After map method',numA)
const numB = numbersA.map(value=>value+50)
console.log('After map arrow function ',numB)

console.log('Array method12')
const filterNumA = numbersA.filter(function(value,index){
    if(value>250){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNumA)
const fillterArrowA = numbersA.filter(value=>value>200)
console.log('After fatarrow method',fillterArrowA)
console.log('==========================================')
console.log('Array Method 5')

const fruits = ['apple','mango','grape','banana']
const isArrayOrNot5 = Array.isArray(fruits)
console.log('Fruits array or not',isArrayOrNot);
console.log('=============================')

console.log('Array method2')
const hasapple = fruits.includes('mango');
console.log('using includes method',hasapple);

console.log('Array method3')
fruits.push('orange','guvva')
console.log('After push Method',fruits)

console.log('Array method4')
fruits.pop()
console.log('After pop Method',fruits)

console.log('Array method5')
fruits.unshift('dry fruit','jack fruit');
console.log('After Unshift method',fruits)

console.log('Array method6')
fruits.shift()
console.log('After shift method',fruits)

console.log('Array method7')
const fruits1 =['pear','kino','cherry','berry']
fruits1.splice(1,2,'food','eat')
console.log('After Splice Method',fruits1);


console.log('Array method8')
const aftersliceB = fruits1.slice(2,4)
console.log('After Slice Method',aftersliceB)

console.log('Array method9')
const indexOfCodingB = fruits1.indexOf('cherry',2)
console.log('Index Of Coding', indexOfCodingB);

console.log('Array method10')

const stringFruits = fruits1.join('-')
console.log('String Names',stringFruits);

console.log('Array method11')
const value =[50,30,60,70]
 const val = value.map(function(key,index){
    let newkey = key+60
    return newkey
})
console.log('After map method',val)
const val1 = value.map(key=>key+50)
console.log('After map arrow function ',val1)

console.log('Array method12')
const filterNumb = value.filter(function(key,index){
    if(key>250){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNumb)
const fillterArrowb = value.filter(key=>key>200)
console.log('After fatarrow method',fillterArrowb)
console.log('==========================================')


