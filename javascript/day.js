function first(CallFunc){
    setTimeout(function(){
        console.log('First Function Executed')
        CallFunc();

    },0)

    //console.log('Excuted')
    
}

function second(){
    console.log('second Function Executed')

}

first(second)
//second()