import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  entr: any;
  inputdata;

  constructor(private http: HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }


  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=7ed2ab24a890457da076721c5c2b6bf5&country='+this.inputdata).subscribe(data => {
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
   
   getNews(){
     this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=7ed2ab24a890457da076721c5c2b6bf5').subscribe(data =>{
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
}
