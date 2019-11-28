import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop-parent',
  templateUrl: './laptop-parent.component.html',
  styleUrls: ['./laptop-parent.component.css']
})
export class LaptopParentComponent implements OnInit {
  selectlaps ;
  constructor() { }

  laps = [
    {
      imgUrl : 'https://5.imimg.com/data5/KQ/DN/MY-16113916/hp-laptop-computer-500x500.jpg',
      name : 'Hp-laptop',
      cost : 4500,
      desc : 'HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'

    },

    {
      imgUrl : 'https://specials-images.forbesimg.com/imageserve/5d60a467fead280008920348/960x0.jpg?cropX1=0&cropX2=1500&cropY1=327&cropY2=1171',
      name : 'Dell-laptop',
      cost : 55000,
      desc : 'Dell Desktop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },

    {
      imgUrl : 'https://cdn.shopify.com/s/files/1/0225/2590/2923/products/vaio-s13-main-product-image-min_1000x.png?v=1562349830',
      name : 'Sony-laptop',
      cost : 35000,
      desc : 'Sony Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },

    {
      imgUrl : 'https://cdn.shopify.com/s/files/1/1843/7055/products/Upright-open_9932d37e-0548-438d-8e37-49fb9d41c892.jpg?v=1559901915',
      name : 'Apple-laptop',
      cost : 60000,
      desc : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
    }
  ];

  ngOnInit() {
  }

  sendlap(lap) {
    console.log(lap);
    this.selectlaps = lap;
  }

}
