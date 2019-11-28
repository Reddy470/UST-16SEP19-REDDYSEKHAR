var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "mikel";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 9100169154;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "abcd";
address = 253637;
console.log(address, typeof address);
console.log("User defined variable");
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("mikel", 24);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollname) {
        var _this = _super.call(this, name, age) || this;
        _this.rollname = rollname;
        return _this;
    }
    return Student;
}(person));
var Student1 = new Student("jhon", 23, 123456);
console.log(Student1);
