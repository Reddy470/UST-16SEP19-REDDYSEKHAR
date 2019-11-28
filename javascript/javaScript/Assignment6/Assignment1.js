function validateform(){
    
    var  username = document.myform.username.value;
    var password = document.myform.password.value;
    if (username.length<5){
        alert("Name must be at least 5 characters long.");
        return false;
    }else if(password.length<5){
        alert("Password must be at least 5 characters long.");
        return false;
    }
}
