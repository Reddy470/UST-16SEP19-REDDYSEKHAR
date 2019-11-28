import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
entr;
inputdata;
  constructor(private http:HttpClient) {
     this.getNews();
    }

  ngOnInit() {
  }

  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=7ed2ab24a890457da076721c5c2b6bf5&country=in&category='+this.inputdata).subscribe(data => {
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
   
   getNews(){
     this.http.get<any>('https://newsapi.org/v2/top-headlines?country=id&category=business&apiKey=7ed2ab24a890457da076721c5c2b6bf5').subscribe(data =>{
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
}
