import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comment-detailes',
  templateUrl: './comment-detailes.component.html',
  styleUrls: ['./comment-detailes.component.css']
})
export class CommentDetailesComponent implements OnInit {
  Comments: any[] = [];

  constructor() { }

  ngOnInit() {
  }
  getAllComments(childData) {
    console.log('child Data', childData);
    this.Comments.push(childData);

  }

}
