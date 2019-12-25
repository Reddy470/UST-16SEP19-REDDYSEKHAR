import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-deletestudent',
  templateUrl: './deletestudent.component.html',
  styleUrls: ['./deletestudent.component.css']
})
export class DeletestudentComponent implements OnInit {

  books: any;
  selectedUser;
  constructor(private service: UserService) { }


  booksData(form: NgForm){
    console.log(form.value);
    this.service.userDetails(form.value).subscribe(data => {
      this.books = data;
      console.log(this.books);
      form.reset();
    },err => {
      console.log(err);
    },() => {
      console.log('data posted successfully');
    });

  }


  deleteData(book) {
    console.log(book);
    this.service.getStudent(book.sno).subscribe (data =>{
      console.log(data);
  
    },err => {
      console.log(err);
    }, ()=> {
      console.log('data deleted successfully');
    })

  }

  ngOnInit() {
  }

}
