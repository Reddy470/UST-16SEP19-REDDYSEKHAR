import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-getall-book',
  templateUrl: './getall-book.component.html',
  styleUrls: ['./getall-book.component.css']
})
export class GetallBookComponent implements OnInit {

  books: any;
  selectedUser;
  constructor(private service: UserService) { }


  booksData() {
    this.service.getData().subscribe(details => {
      this.books = details;

      console.log(this.books);
     });
    }

 

  deleteData(book) {
    console.log(book);
    this.service.deleteUser(book.bid).subscribe (data =>{
      console.log(data);
  
    },err => {
      console.log(err);
    }, ()=> {
      console.log('data deleted successfully');
    })

  }

  selectUser(book) {
    console.log(book);
    this.selectedUser = book;
  }
  
  UpdateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value).subscribe (data =>{
      console.log(data);
    },err =>{
      console.log(err);
    }, () =>{
      console.log('data update sucessfully');
    })
  
  }



  ngOnInit() {
  }

}
