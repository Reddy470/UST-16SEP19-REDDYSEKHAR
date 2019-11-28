import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-parent',
  templateUrl: './movie-parent.component.html',
  styleUrls: ['./movie-parent.component.css']
})
export class MovieParentComponent implements OnInit {
  selectCars ;
  constructor() { }

  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      name : 'Adventure',
      rating :5,
      desc : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      name : 'Charlie Chaplin',
      rating : 6,
      desc : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      name : 'Avengers',
      rating : 10,
      desc : 'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with'
    },

    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      name : 'Iron-man',
      rating : 9,
      desc : 'When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.'
    }
  ];

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectCars = car;
  }

}
