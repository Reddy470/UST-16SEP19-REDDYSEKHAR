// Named Functions
function add(num1,num2){
    console.log('sum =',num1+num2)
}
add(10,20)
function add(num1,num2,num3){
    console.log('sum value =',num1+num2+num3);
}

//Function Experssion (Anonymous)
var sub =function(num1,num2){
    var subValue = num1 - num2;
    return subValue;
}
var value = sub(20,10);
console.log('value',value);
console.log('hello');
//Self Invoked Function
( function(num1,num2)
{
    console.log('value =',num1+num2);
})(10,20)
//Fat Arrow Functions
var div=(num1,num2)=>{
    console.log('value =',num1/num2);
}
div(10,5)


var div = num1=>{
    console.log('value =',num1)
}
div(2)

var div =num1=>console.log(num1);
div()
//Named Function
greeting('chandan');
function greeting(msg){
    console.log('Hello',msg);
}

//Function Expression
greeting('Dinga');
var greet = function(msg){
    console.log('Hi',msg);

}

// Fat Arrow Functions
greet('Ding');
var greets = (msg)=>{
    console.log('Hi',msg);
}