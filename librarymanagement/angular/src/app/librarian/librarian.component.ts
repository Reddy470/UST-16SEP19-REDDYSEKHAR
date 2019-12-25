import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-librarian',
  templateUrl: './librarian.component.html',
  styleUrls: ['./librarian.component.css']
})
export class LibrarianComponent implements OnInit {
  details;
  constructor() { }

  ngOnInit() {
    this.details = JSON.parse(localStorage.getItem('userDetails'));
  }

}
