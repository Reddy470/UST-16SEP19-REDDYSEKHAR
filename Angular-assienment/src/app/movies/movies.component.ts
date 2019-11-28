import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  ngOnInit() {

  }
  search;
  searchNews;
  constructor(public http: HttpClient) {
    this.search;
   }

  
  cFun(event) {
    console.log(event.target.value)
    this.http.get<any>('https://newsapi.org/v2/everything?q=bitcoin&from=2019-09-16&sortBy=publishedAt&apiKey=1f4fec4271ee4dfda70b95bdaa8d9516 +event.target.value').subscribe( data => {
      this.searchNews = data.articles;
      console.log(data);
    }, err => {
        console.log(err);
    }, () => {
        console.log('Got Successfuly');
    });

  }

}
