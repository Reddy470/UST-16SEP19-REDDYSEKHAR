import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;

  cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name :  'abc'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name :  'audi'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/05/28/car-1957037__340.jpg',
      name :  'pink'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
      name :  'sports '
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendcar(car) {
  console.log(car);
  this.selectedCar = car;
  }

}
