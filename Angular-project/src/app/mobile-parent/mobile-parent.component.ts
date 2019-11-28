import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile-parent',
  templateUrl: './mobile-parent.component.html',
  styleUrls: ['./mobile-parent.component.css']
})
export class MobileParentComponent implements OnInit {
  selectmobile ;
  constructor() { }

  mobiles = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/05/27/08/51/mobile-phone-1419275__340.jpg',
      name : 'Iphone',
      cost : 34000,
      desc : 'The iPhone has a sleek, minimalist design, and differs from other smartphones in its lack of buttons. Most operations on the iPhone are performed using the touch screen display. ... Internally, the iPhone runs the iOS, an operating system developed by Apple for portable devices.'

    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/20/12/51/mobile-605422__340.jpg',
      name : 'Samsung',
      cost : 25000,
      desc : 'Samsung is a South Korean multinational conglomerate headquartered in Samsung Town, Seoul. It comprises numerous affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol. Samsung was founded by Lee Byung-chul in 1938 as a trading company.'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/13/11/phone-918928_960_720.jpg',
      name : 'Sony',
      cost : 20000,
      desc : 'Xperia is the brand name of smartphones and tablets from Sony Mobile. The name Xperia is derived from the word experience, and was first used in the Xperia X1 tagline..'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/23/21/23/iphone-6-458159__340.jpg',
      name : 'Apple',
      cost : 40000,
      desc : 'The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface. The iPhone runs the iOS operating system (OS), and as of 2017, there were 2.2 million apps available for it through the Apple App Store'
    }
  ];

  ngOnInit() {
  }

  sendmobile(mobile) {
    console.log(mobile);
    this.selectmobile = mobile;
  }

}
