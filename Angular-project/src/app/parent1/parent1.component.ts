import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedLap;
   
  laps = [
    {
      imgUrl :'https://cdn.pixabay.com/photo/2016/02/17/15/37/laptop-1205256__340.jpg',
      name : 'Coffe Arm',
    },
    {
      imgUrl :'https://cdn.pixabay.com/photo/2014/07/30/22/53/notebook-405755_960_720.jpg',
      name : 'Samsung'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/14/03/14/children-1822471_960_720.jpg',
      name : 'Child Lap'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/06/15/13/internet-1028794_960_720.jpg',
      name : 'InternetLap'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendLap(lap) {
    console.log(lap);
    this.selectedLap = lap;

  }

}
