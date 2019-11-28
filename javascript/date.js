var todayDate =new Date();
console.log('Todays Date',todayDate);

console.log('Day',todayDate.getDay());
console.log('year',todayDate.getFullYear());
console.log('month',todayDate.getMonth());
console.log('Date',todayDate.getDate());
var constMilli  =  new Date(0);
console.log('Date',constMilli);
var constString = new Date('nov 10');
console.log('Date String Constructor ',constString);
var constYear = new Date(2107,10);
console.log('Date Year Constructor ',constYear);