console.log('Array method1')
const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming']
const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not',isArrayOrNot);

console.log('Array method2')
const hasCricket = hobbies.includes('Cricket');
console.log('using includes method',hasCricket);

console.log('Array method3')
hobbies.push('Guitar','Volleyball')
console.log('After push Method',hobbies)

console.log('Array method4')
hobbies.pop()
console.log('After pop Method',hobbies)

console.log('Array method5')
hobbies.unshift('Numismatics','Singing');
console.log('After Unshift method',hobbies)

console.log('Array method6')
hobbies.shift()
console.log('After shift method',hobbies)

console.log('Array method7')
const hobbies1 =['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('After Splice Method',hobbies1);


console.log('Array method8')
const aftersliice = hobbies1.slice(2,4)
console.log('After Slice Method',aftersliice)

console.log('Array method9')
const indexOfCoding = hobbies1.indexOf('coding',2)
console.log('Index Of Coding', indexOfCoding);

console.log('Array method10')

const stringHobbies = hobbies1.join('-')
console.log('String Hobbies',stringHobbies);

console.log('Array method11')
const numbers =[100,200,300,400]
 const num1 = numbers.map(function(value,index){
    let newvalue = value+50
    return newvalue
})
console.log('After map method',num1)
const num2 = numbers.map(value=>value+50)
console.log('After map arrow function ',num2)

console.log('Array method12')
const filterNum = numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum)
const fillterArrow = numbers.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow)


