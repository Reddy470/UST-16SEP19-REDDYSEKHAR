import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike-parent',
  templateUrl: './bike-parent.component.html',
  styleUrls: ['./bike-parent.component.css']
})
export class BikeParentComponent implements OnInit {
  selectCars ;
  constructor() { }

  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      name : 'Royal-Enfiled',
      model : 2018,
      desc : ''
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/09/20/11/motorcycle-933022__340.jpg',
      name : 'R1',
      model : 2017,
      desc : ''
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/09/17/13/15/motocross-4483484__340.jpg',
      name : 'Grand prix',
      model : 2016 ,
      desc : ''
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/02/11/21/11/motorcycle-3990790__340.jpg',
      name : 'Reddy',
      model : 2019,
      desc : ''
    }

  ];

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectCars = car;
  }
}
