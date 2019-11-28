import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car-parent',
  templateUrl: './car-parent.component.html',
  styleUrls: ['./car-parent.component.css']
})
export class CarParentComponent implements OnInit {
  selectCars ;
  constructor() { }

  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521__340.jpg',
      name : 'Fait aut-500',
      model : 2007,
      desc : 'The Fiat 500 (codeproject Type 312) is a two-door, four-passenger, transverse front-engine, ... Derived from the 2004 Fiat Trepiùno 3+1 concept (designed by Roberto .... The fixed-profile convertible variant of the 500 debuted at the Geneva Motor ... The Abarth 500 is a performance model of the Fiat 500 tuned in-house by ...'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/05/28/car-1957037__340.jpg',
      name : 'Aston Martin',
      model : 1998,
      desc  : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },

    {
      imgUrl : 'https://ea523e0086477a301f8a-93edf0db53fdc71ae736efd05326ab4b.ssl.cf1.rackcdn.com/WBY2Z2C56GV674943/3f95291d40412ee43b3780c80839f1eb.jpg',
      name : 'BMW-I8',
      model: 2016,
      desc : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/02/19/11/44/car-1209912__340.jpg',
      name : 'Tesla',
      model : 3,
      desc : 'Tesla Model 3 owners in cold climate are starting to uncover what appears to be a design flaw in an underbody panel of the vehicle – resulting in sand and water getting stuck. Over the years, Tesla has often been accused of designing cars in California for the Californian climate.'
    }
  ];

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectCars = car;
  }

}
