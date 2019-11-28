import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl ,Validators, NgForm} from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  get email() {
    return this.form.get('email');
  }
  get password() {
    return this.form.get('password');
  }

  form = new FormGroup ({
    email : new FormControl('',[Validators.required]),
    password : new FormControl('',[Validators.required])
  });

  

  Users;
  selectedUser;

  constructor(public service : UserService) {
    this.getData();
   }

  ngOnInit() {
  }

  loginData(form : NgForm){
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    },err =>{
      console.log(err);
    }, ()=>{
      console.log('data posted successfully');
    });

  }
  getData() {
this.service.getUser().subscribe (data =>{
  console.log(data);
  this.Users = data;
},err => {
  console.log(err);
}, () =>{
  console.log('data get successfully');

})
  }

  deleteData(User) {
    console.log(User);
    this.service.deleteUser(User.id).subscribe (data =>{
      console.log(data);
      this.getData();
    },err => {
      console.log(err);
    }, ()=> {
      console.log('data deleted successfully');
    })

  }
  selectUser(User) {
    console.log(User);
    this.selectedUser = User;
  }
  UpdateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id,form.value).subscribe (data =>{
      console.log(data);
    },err =>{
      console.log(err);
    }, () =>{
      console.log('data update sucessfully');
    })
  
  }
}


