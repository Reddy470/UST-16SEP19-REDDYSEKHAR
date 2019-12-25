import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {
     books: any;
  constructor(private http: HttpClient,private service : UserService) {
    this.getData();
  }
  getData() {
    this.http.get<any>('http://localhost:8080/librarymanagement/getall').subscribe(data => {
      console.log(data);
      this.books = data.addBeans;
    });
  }

  booksData() {
    this.service.getData().subscribe(details => {
      this.books = details;

      console.log(this.books);
     });
    }



  
  ngOnInit() {
  }

}
