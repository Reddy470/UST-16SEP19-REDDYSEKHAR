console.log("FOR ARRAY FUNCTION..:");

console.log('FUNCTION 1');
 function sum1(num1,num2){
    var arry = [23,43,56,77,88,99,123];
    var len = arry.length;
    arry[len-1] = num1;
    arry[len] = num2;
    var sum = 0;
    for(var i=0; i<arry.length; i++)
    {
        sum = sum + arry[i];
    }
    return sum;
}
console.log('SUM = ',sum1(10,20));

console.log('FUNCTION 2');
var b = function(num1,num2){
    var arry = [23,43,56,77,88,99,123];
    var len = arry.length;
    arry[len-1] = num1;
    arry[len] = num2;
    var sum = 0;
    for(var i=0; i<arry.length; i++)
    {
        sum = sum + arry[i];
    }
    return sum;
}
console.log('SUM = ',b(10,20));

console.log('FUNCTION 3');
(
    function(num1,num2)
    {
        var arry = [23,43,56,77,88,99,123];
        var len = arry.length;
        arry[len-1] = num1;
        arry[len] = num2;
        var sum = 0;
        for(var i=0; i<arry.length; i++)
        {
            sum = sum + arry[i];
        }
        return sum;
    }
)
var v = (10,20);
console.log("SUM = ",v);


console.log("FuNCTION 4")
var a = (num1,num2)=>{
    var arry = [23,43,56,77,88,99,123];
    var len = arry.length;
    arry[len-1] = num1;
    arry[len] = num2;
    var sum = 0;
    for(var i=0; i<arry.length; i++)
    {
        sum = sum + arry[i];
    }
    return sum;
}

console.log('SUM = ',a(10,20));
