import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedBike;
   
  bikes = [
    {
      imgUrl :'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299_960_720.jpg',
      name : 'vintage',
    },
    {
      imgUrl :'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'Bullet'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/31/23/30/motocross-2028197__340.png',
      name : 'Raceing'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/31/23/30/stuntman-2028201__340.png',
      name : 'StuntMan'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    console.log(bike);
    this.selectedBike = bike;

  }

}
