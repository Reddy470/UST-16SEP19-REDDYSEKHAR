import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-modify-product',
  templateUrl: './modify-product.component.html',
  styleUrls: ['./modify-product.component.css']
})
export class ModifyProductComponent implements OnInit {

  
  products: any;
  selectedUser;
  constructor(private service: UserService) { }


  productsData() {
    this.service.getData().subscribe(details => {
      this.products = details;

      console.log(this.products);
     });
    }

 

 

  selectUser(product) {
    console.log(product);
    this.selectedUser = product;
  }
  
  UpdateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value).subscribe (data =>{
      form.reset();
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
