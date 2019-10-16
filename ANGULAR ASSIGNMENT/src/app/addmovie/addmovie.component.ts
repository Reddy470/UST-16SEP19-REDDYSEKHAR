import { Component, OnInit } from '@angular/core';
import { Validators, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  get login(){
    return this.form.get('login');
  }

  get title(){
    return this.form.get('title');
  }
  get imageurl(){
    return this.form.get('imageurl');
  }
  get desc(){
    return this.form.get('desc');
  }


  constructor() { }

  form = new FormGroup({
    login : new FormControl('', [Validators.required,]),
    title : new FormControl('', [Validators.required]),
    imageurl : new FormControl('', [Validators.required]),
    desc : new FormControl('', [Validators.required]),
  });

  ngOnInit() {
  }

}
