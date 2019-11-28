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
      imgUrl : 'https://cdn.pixabay.com/photo/2016/07/11/15/43/pretty-woman-1509956__340.jpg',
      name :  'REDDY WIFE'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/04/08/15/09/daisy-712892__340.jpg',
      name :  ' LOVE'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/08/20/15/47/sunset-174276__340.jpg',
      name :  'FLOWERS'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/07/25/01/22/cat-2536662__340.jpg',
      name :  'CHUBBY'
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
