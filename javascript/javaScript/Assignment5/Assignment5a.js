console.log('Array method1')
const names= ['abc','xyz','vcx','rx','smb']
const isArrayOrNot = Array.isArray(names)
console.log('Names array or not',isArrayOrNot);
console.log('====================')

console.log('Array method2')
const hasabc = names.includes('abc');
console.log('using includes method',hasabc);

console.log('Array method3')
names.push('reddy','sekhar')
console.log('After push Method',names)

console.log('Array method4')
names.pop()
console.log('After pop Method',names)

console.log('Array method5')
names.unshift('reading','watchin');
console.log('After Unshift method',names)

console.log('Array method6')
names.shift()
console.log('After shift method',names)

console.log('Array method7')
const names1 =['susmitha','navvu','chinni','reddy','mannu']
names1.splice(1,2,'sister','cute')
console.log('After Splice Method',names1);


console.log('Array method8')
const afterslice = names1.slice(2,4)
console.log('After Slice Method',afterslice)

console.log('Array method9')
const indexOfCoding = names1.indexOf('reddy',2)
console.log('Index Of Coding', indexOfCoding);

console.log('Array method10')

const stringNames = names1.join('-')
console.log('String Names',stringNames);

console.log('Array method11')
const numbers =[300,300,300,300]
 const num1 = numbers.map(function(value,index){
    let newvalue = value+60
    return newvalue
})
console.log('After map method',num1)
const num2 = numbers.map(value=>value+50)
console.log('After map arrow function ',num2)

console.log('Array method12')
const filterNum = numbers.filter(function(value,index){
    if(value>250){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum)
const fillterArrow = numbers.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow)
console.log('==========================================')
console.log('Array Method 2')

console.log('Array method2')
const number = [10,20,30,40,440]
const isArrayOrNot1 = Array.isArray(number)
console.log('Number array or not',isArrayOrNot);
console.log('==========================')




console.log('Array method2')
const hasCricket = number.includes(20);
console.log('using includes method',hasCricket);

console.log('Array method3')
number.push(50,70)
console.log('After push Method',number)

console.log('Array method4')
number.pop()
console.log('After pop Method',number)

console.log('Array method5')
number.unshift(93,70);
console.log('After Unshift method',number)

console.log('Array method6')
number.shift()
console.log('After shift method',number)

console.log('Array method7')
const number1 =[470,570,493,457,476]
number1.splice(1,2,409,408)
console.log('After Splice Method',number1);


console.log('Array method8')
const afterslice1 = number1.slice(2,4)
console.log('After Slice Method',afterslice1)

console.log('Array method9')
const indexOfCoding1 = number1.indexOf('570',2)
console.log('Index Of Coding', indexOfCoding1);

console.log('Array method10')

const stringHobbies = number1.join('-')
console.log('String Hobbies',stringHobbies);

console.log('Array method11')
const numbers1 =[400,600,800,900]
 const num4 = numbers1.map(function(value,index){
    let newvalue = value+70
    return newvalue
})
console.log('After map method',num4)
const num3 = numbers1.map(value=>value+70)
console.log('After map arrow function ',num3)

console.log('Array method12')
const filterNum1 = numbers1.filter(function(value,index){
    if(value>300){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum1)
const fillterArrow1 = numbers1.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow1)




console.log('=====================================')
console.log('Array method 3')
const mix = ['a12b','b3n','c34n','nm34','rs97']
const isArrayOrNot2 = Array.isArray(mix)
console.log('Mix array or not',isArrayOrNot);
console.log('======================')

console.log('Array method2')
const hasb3n = mix.includes(20);
console.log('using includes method',hasb3n);

console.log('Array method3')
mix.push('c2c','b2b')
console.log('After push Method',mix)

console.log('Array method4')
mix.pop()
console.log('After pop Method',mix)

console.log('Array method5')
mix.unshift('a1','b1');
console.log('After Unshift method',mix)

console.log('Array method6')
mix.shift()
console.log('After shift method',mix)

console.log('Array method7')
const mix1 =['ef12d','bc23','xy9z']
mix1.splice(1,2,'dc26','vx23')
console.log('After Splice Method',mix1);


console.log('Array method8')
const afterslice2 = mix1.slice(2,3)
console.log('After Slice Method',afterslice2)

console.log('Array method9')
const indexOfCoding2 = mix1.indexOf('xy9z',2)
console.log('Index Of Coding', indexOfCoding2);

console.log('Array method10')

const stringMix1 = mix1.join('-')
console.log('String Hobbies',stringMix1);

console.log('Array method11')
const numbers2 =[600,600,600,600]
 const num6 = numbers2.map(function(key,index){
    let newkey = key+70
    return newkey
})
console.log('After map method',num6)
const num7 = numbers2.map(key=>key+70)
console.log('After map arrow function ',num7)

console.log('Array method12')
const filterNum2 = numbers2.filter(function(value,index){
    if(value>300){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum2)
const fillterArrow2 = numbers2.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow2)




console.log('=====================================')





