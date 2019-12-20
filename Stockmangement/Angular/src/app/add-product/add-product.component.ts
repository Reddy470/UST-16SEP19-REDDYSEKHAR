import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  
  constructor(private service: UserService, private  router: Router) { }



  product(form : NgForm) {
    console.log('values are', form.value);
    this.service.addproduct(form.value).subscribe(res => {
      form.reset();
      console.log(res);
      if (res !== 0) {
      alert('Successfully Adding products ');
    } else {
      alert('Adding products failed');
    }

   }, err => {
     console.log(err);
     
   });

  }

  ngOnInit() {
  }

}
