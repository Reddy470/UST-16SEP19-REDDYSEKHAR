import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';

@Component({
  selector: 'app-searchprodtname',
  templateUrl: './searchprodtname.component.html',
  styleUrls: ['./searchprodtname.component.css']
})
export class SearchprodtnameComponent implements OnInit {
  product_info:any;
  products: any;
  entr: any;
  details: any;
  // products: any;
  constructor(private http: HttpClient,private service : UserService) {
   
  }
  getEnt(event) {
    this.product_info =event.target.value;
    this.http.get<any>('http://localhost:8080/search?name='+this.product_info).subscribe(data => {
     this.entr = data.products;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('product got successfully');
     } );
   }

   

  

  
  ngOnInit() {
    this.product_info = JSON.parse(localStorage.getItem('userDetails'));

  }

}
