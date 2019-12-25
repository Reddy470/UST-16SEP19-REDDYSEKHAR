import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {

  studentBeans;
  public getAllRequestedBook;
  public sno;
  constructor(private http: HttpClient, private service: UserService, private router: Router) {  }

  ngOnInit() {
  
    
  }

}
