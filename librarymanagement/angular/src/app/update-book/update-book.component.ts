import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {
  
  books: any;
  constructor( private service: UserService) { }

  ngOnInit() {
  }

  getDetails() {
    this.service.getData().subscribe(details => {
      this.books = details;

      console.log(this.books);
     });
    }

}
