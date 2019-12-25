import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';

@Component({
  selector: 'app-serch-category',
  templateUrl: './serch-category.component.html',
  styleUrls: ['./serch-category.component.css']
})
export class SerchCategoryComponent implements OnInit {

  product: any;
  constructor(private http: HttpClient,private service : UserService) {
    this.getData();
  }
  getData() {
    this.http.get<any>('http://localhost:8080/getall').subscribe(data => {
      console.log(data);
      this.product = data.products;
    });
  }

  booksData() {
    this.service.getData().subscribe(details => {
      this.product = details;

      console.log(this.product);
     });
    }





  ngOnInit() {
  }

}
