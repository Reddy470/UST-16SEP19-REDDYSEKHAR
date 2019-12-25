import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private user: UserService, private route: Router) { }

  login(form: NgForm) {
    console.log('form values', form.value);
    this.user.loginUser(form.value).subscribe(resp => {
        console.log('my responce', resp);
        form.reset();
        console.log('user type', resp.type);
        if (resp.type === 'user') {
          this.user.isuserLoggedIn = true;
          localStorage.setItem('userDetails',JSON.stringify(resp));
          this.route.navigateByUrl('/user');
        } else {
          this.user.isLibLoggedIn = true;
          localStorage.setItem('userDetails', JSON.stringify(resp));
          this.route.navigateByUrl('/lib');
        }
    });

  }

  ngOnInit() {
  }

}
