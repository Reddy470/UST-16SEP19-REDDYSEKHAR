import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private add: UserService, private  router: Router) { }



  login(form : NgForm) {
    console.log('values are', form.value);
    this.add.addBook(form.value).subscribe(res => {
      form.reset();
      console.log(res);
      if (res !== 0) {
      alert('Successfully Adding Books ');
    } else {
      alert('Adding Books failed');
    }

   }, err => {
     console.log(err);
     
   });

  }




  ngOnInit() {
  }

  



}
