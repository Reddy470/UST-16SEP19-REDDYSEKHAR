console.log('FUNCTION 1');
function factorial(x)
{
    if(x===0)
    {
        return 1;
    }
    return x*factorial(x-1);
}
console.log(factorial(5));

console.log('FUNCTION 2');
var sub = function(x)
{
    if(x===0)
    {
        return 1;
    }
    return x*factorial(x-1);
}
console.log(sub(5));

//console.log('FUNCTION 3');
(
    function(x)
    {
        if(x===0)
        {
            return 1;
        }
        return x*factorial(x-1);
    }
)
var fact=(5)
//console.log(''sum ='fact*);
console.log('FUNCTION 4');
var div=(x)=>
{
    if(x===0)
    {
        return 1;
    }
    return x*factorial(x-1);
}
console.log(div(5));


