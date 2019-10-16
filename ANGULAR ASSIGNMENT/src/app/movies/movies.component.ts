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
    movies;
      constructor(public http: HttpClient) { 
       
      }

      showMovies(event) {
        this.http.get<any>('http://www.omdbapi.com/?apikey&=edd8d63f').subscribe(data => {
          this.movies = data.search;
        }, err => {
          console.log(err);
        }, () => {
          console.log('entertainment news get successfully');
        
        });
          
      }


}
