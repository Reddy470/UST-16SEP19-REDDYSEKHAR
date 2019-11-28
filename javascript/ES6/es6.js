const employees = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name : 'Billgate',
            age : 56
        },{
            name : 'reddy',
            age : 23
        },{
            name : 'sekhar',
            age : 23
        
        }])
    }else {
        reject('Faild')
    }
})
employees.then(function(data){
    console.log('employees data ', data)
}).catch(function(error){
    console.log('failure message',error)
})

//closures

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value ',counter)