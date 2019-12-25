import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';

@Component({
  selector: 'app-search-company',
  templateUrl: './search-company.component.html',
  styleUrls: ['./search-company.component.css']
})
export class SearchCompanyComponent implements OnInit {

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
