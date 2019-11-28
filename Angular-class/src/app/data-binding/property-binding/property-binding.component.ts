import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name: string = 'Reddy';
imgUrl: 'https://cdn.pixabay.com/photo/2019/09/13/15/13/chicken-4474176__340.jpg';
address: string = 'Nadimecherla,kalakada';
colorName: string ='green';
isActive: boolean = false;
colspanValue: number = 2; 

  constructor() { }

  ngOnInit() {
    setInterval(() => {
this.colorName = 'red';
this.isActive = !this.isActive;
}, 2000);
  }

}
