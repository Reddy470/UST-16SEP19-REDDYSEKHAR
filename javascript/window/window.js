console.log('Window object',window);
console.log('This keyword ',this);
console.log(this===window)
//window.alert('welcome to javascript class')
//alert('welcome ust global and test yantra')
//let confirmDelete = confirm('are you sure you want to delete')
//console.log('confirm Delete',confirmDelete)
//let userName = prompt('what is your name','Reddy')
//console.log('User Name',userName)


const person ={
    firstName : 'Alia',
    age : 26,
    lastName : 'kappor',
    getName : function(){
        console.log('This keyword',this)
        return this.firstName+' '+this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName)
