import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';

@Component({
  selector: 'app-serch-category',
  templateUrl: './serch-category.component.html',
  styleUrls: ['./serch-category.component.css']
})
export class SerchCategoryComponent implements OnInit {

  product_info:any;
  products: any;
  entr: any;
  // products: any;
  constructor(private http: HttpClient,private service : UserService) {
   
  }
  getEnt(event) {
    this.product_info =event.target.value;
    this.http.get<any>('http://localhost:8080/search?catogory='+this.product_info).subscribe(data => {
     this.entr = data.products;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('product got successfully');
     } );
   }
  


  ngOnInit() {
  }

}
