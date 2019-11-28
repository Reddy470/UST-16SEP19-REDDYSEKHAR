console.log('Array method6')
const movies = ['spyder','maharshi','saaho','valmiki','avaru']
const isArrayOrNot6 = Array.isArray(movies)
console.log('movies array or not',isArrayOrNot6);

console.log('Array method2')
const hasSpyder = movies.includes('spyder');
console.log('using includes method',hasSpyder);

console.log('Array method3')
movies.push('rx100','nani')
console.log('After push Method',movies)

console.log('Array method4')
movies.pop()
console.log('After pop Method',movies)

console.log('Array method5')
movies.unshift('fightings','danceing');
console.log('After Unshift method',movies)

console.log('Array method6')
movies.shift()
console.log('After shift method',movies)

console.log('Array method7')
const movies1 =['srimanthudu','pokiri','dukudu','no1']
movies1.splice(1,2,'films','names')
console.log('After Splice Method',movies1);


console.log('Array method8')
const aftersliice = movies1.slice(2,4)
console.log('After Slice Method',aftersliice)

console.log('Array method9')
const indexOfCoding = movies1.indexOf('pokiri',2)
console.log('Index Of Coding', indexOfCoding);

console.log('Array method10')

const stringMovies = movies1.join('-')
console.log('String Movies',stringMovies);

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



console.log('================================')
const heros = ['mahesh babu','nani','ntr','vijay','yash']
const isArrayOrNot7 = Array.isArray(heros)
console.log('heros array or not',isArrayOrNot7);
console.log('============================')
console.log('Array method2')
const hasNani = heros.includes('nani');
console.log('using includes method',hasNani);

console.log('Array method3')
heros.push('ram','venky')
console.log('After push Method',heros)

console.log('Array method4')
heros.pop()
console.log('After pop Method',heros)

console.log('Array method5')
heros.unshift('name','actors');
console.log('After Unshift method',heros)

console.log('Array method6')
heros.shift()
console.log('After shift method',heros)

console.log('Array method7')
const heros1 =['nikhil','sampu','ramcharan','nag']
heros1.splice(1,2,'movi','song')
console.log('After Splice Method',heros1);


console.log('Array method8')
const aftersliice1= heros1.slice(2,4)
console.log('After Slice Method',aftersliice1)

console.log('Array method9')
const indexOfCoding1 = heros1.indexOf('sampu',2)
console.log('Index Of Coding', indexOfCoding1);

console.log('Array method10')

const stringHeros = heros1.join('-')
console.log('String Hobbies',stringHeros);

console.log('Array method11')
const numbersa =[100,200,300,400]
 const numb = numbersa.map(function(value,index){
    let newvalue = value+50
    return newvalue
})
console.log('After map method',numb)
const numb2 = numbersa.map(value=>value+50)
console.log('After map arrow function ',numb2)

console.log('Array method12')
const filterNum1 = numbersa.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum1)
const fillterArrow1 = numbersa.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow1)


console.log('====================================')
console.log('Array method1')
const singers = ['thaman','dsp','anuridh','manisharma','kiravani']
const isArrayOrNot8 = Array.isArray(singers)
console.log('singers array or not',isArrayOrNot8);
console.log('====================')
console.log('Array method2')
const hasdsp = singers.includes('dsp');
console.log('using includes method',hasdsp);

console.log('Array method3')
singers.push('Guitar','song')
console.log('After push Method',singers)

console.log('Array method4')
singers.pop()
console.log('After pop Method',singers)

console.log('Array method5')
singers.unshift('background score','Singing');
console.log('After Unshift method',singers)

console.log('Array method6')
singers.shift()
console.log('After shift method',singers)

console.log('Array method7')
const singers1 =['chinmayi','harini','geetha madhuri']
singers1.splice(1,2,'telugu','sing')
console.log('After Splice Method',singers1);


console.log('Array method8')
const aftersliice2 = singers1.slice(2,4)
console.log('After Slice Method',aftersliice2)

console.log('Array method9')
const indexOfCoding2 = singers1.indexOf('harini',2)
console.log('Index Of Coding', indexOfCoding2);

console.log('Array method10')

const stringSinger = singers1.join('-')
console.log('String Hobbies',stringSinger);

console.log('Array method11')
const numbers1 =[100,200,300,400]
 const num2a = numbers1.map(function(value,index){
    let newvalue = value+50
    return newvalue
})
console.log('After map method',num2a)
const num3 = numbers1.map(value=>value+50)
console.log('After map arrow function ',num3)

console.log('Array method12')
const filterNum1a = numbers1.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNum1a)
const fillterArrow1a = numbers1.filter(value=>value>200)
console.log('After fatarrow method',fillterArrow1a)


console.log('========================================')
const cricketers = ['Dhoni','kholi','raina','rahul','jadeja']
const isArrayOrNot9 = Array.isArray(cricketers)
console.log('cricketers array or not',isArrayOrNot9);
console.log('==========================')
console.log('Array method2')
const hasKholi = cricketers.includes('kholi');
console.log('using includes method',hasKholi);

console.log('Array method3')
cricketers.push('india','players')
console.log('After push Method',cricketers)

console.log('Array method4')
cricketers.pop()
console.log('After pop Method',cricketers)

console.log('Array method5')
cricketers.unshift('games','playing');
console.log('After Unshift method',cricketers)

console.log('Array method6')
cricketers.shift()
console.log('After shift method',cricketers)

console.log('Array method7')
const cricketers1 =['dawan','buvi','bhumra','pant']
cricketers1.splice(1,2,'new players','cricket')
console.log('After Splice Method',cricketers1);


console.log('Array method8')
const afterslice4 = cricketers1.slice(2,4)
console.log('After Slice Method',afterslice4)

console.log('Array method9')
const indexOfCoding4 = cricketers1.indexOf('buvi',2)
console.log('Index Of Coding', indexOfCoding4);

console.log('Array method10')

const stringHobbies = cricketers1.join('-')
console.log('String Hobbies',stringHobbies);

console.log('Array method11')
const numbersC =[100,200,300,400]
 const numC = numbersC.map(function(value,index){
    let newvalue = value+50
    return newvalue
})
console.log('After map method',num1)
const num2b = numbersC.map(value=>value+50)
console.log('After map arrow function ',num2b)

console.log('Array method12')
const filterNumC = numbersC.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('After fillter method',filterNumC)
const fillterArrowC = numbersC.filter(value=>value>200)
console.log('After fatarrow method',fillterArrowC)



