let myName : string = "mikel";

console.log(myName,typeof myName);

let age : number;

console.log(age,typeof age);

let mobileNumber = 9100169154;

console.log(mobileNumber,typeof mobileNumber);

let address;

address = "abcd";

address = 253637;

console.log(address,typeof address);

console.log("User defined variable");

class person {
    constructor(public name : string, public age : number){

    }
}

let person1 = new person("mikel", 24)
console.log(person1);

class Student extends person{
    constructor(name : string, age : number, public rollname : number){
        super(name,age);

    }
}


let Student1  = new Student("jhon",23,123456);
console.log(Student1);