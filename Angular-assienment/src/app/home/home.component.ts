import { Component, OnInit } from '@angular/core';

import { HttpClient  } from   '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }
    news;
    enter;
    show;
      constructor(public http: HttpClient) { 
        this.getNews();
        this.enterNews();
        this.display();
      }

      enterNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=1f4fec4271ee4dfda70b95bdaa8d9516').subscribe(data => {
          this.enter = data.articles;
        }, err => {
          console.log(err);
        }, () => {
          console.log('entertainment news get successfully');
        
        });
          
      }
      
      getNews() {
        
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=1f4fec4271ee4dfda70b95bdaa8d9516 ').subscribe(data => {
        this.news = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news get successfully');
      });
    }
    
    
    display() {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=1f4fec4271ee4dfda70b95bdaa8d9516 ').subscribe(data => {
        this.display= data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('sportsS news get successfully');
      
      });
        
    }
    
    
    }
    
