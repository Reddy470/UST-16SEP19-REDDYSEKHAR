import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent  {



  constructor(private router: Router,private service : UserService) { }

   isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
     if (userDetails) {
       return true;
     } else {
       return false;
     }
   }

  get isLibLoggedIn (){
    return this. service.isLibrarianLoggedIn();
  }

  get isuserLoggedIn(){
    return this. service.isUserLoggedIn();

  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
    this.service.isLibLoggedIn = false;
    this.service.isuserLoggedIn = false;
  }
ngOnInit(){}


  

  

}
