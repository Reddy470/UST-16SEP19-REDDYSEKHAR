var brands=['kingfisher','bisleri','aqua','kinely']
console.log('For of Loop')
for(var element of brands){
    console.log('Brand =',element);
}
console.log('======================');
console.log('For in Loop')

for(var index in brands){
    console.log('Brand =',brands[index])
}
console.log('===============');
console.log('For in Loop')
var person={
    name:'sundari',
   age:33,
   color: 'white'
}
for(var key in person){
    console.log('value =',person[key])
}
console.log('========================');
console.log('for Each Method of Array')
var movies =['sholay','mayabazar','jurassic park','titanic']
movies.forEach(function(value,index){
    console.log('Movies =',value)
    console.log('Movie Index =',index)
})

console.log('For Each for items')
var items =[
    {
        item : 'bangles',
        id :  1,
        price : 100
    },
    {
        item : 'eyeliner',
        id : 2,
        price : 500
    },
    {
        item : 'watch',
        id : 3,
        price : 5000
    },
    {
        item : 'bike',
        id : 4,
        price :  1000000
    }
]
items.forEach(function(item,index){
    console.log('Item =',item)
    console.log('Index of item =',index)
})


console.log('Does not Consider')
var numbers = [10,20,30,40,,50]
for(var i=0;i<numbers.length;i++){
    console.log('for loop =',numbers)
}
