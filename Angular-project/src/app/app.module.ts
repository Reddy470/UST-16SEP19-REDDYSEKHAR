import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarParentComponent } from './car-parent/car-parent.component';
import { CarChildComponent } from './car-child/car-child.component';
import { RouterModule } from '@angular/router';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';

import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { MovieParentComponent } from './movie-parent/movie-parent.component';
import { MovieChildComponent } from './movie-child/movie-child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { FormsModule,ReactiveFormsModule }  from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarParentComponent,
    CarChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    LaptopParentComponent,
    LaptopChildComponent,
    MobileParentComponent,
    MobileChildComponent,
    MovieParentComponent,
    MovieChildComponent,
    CommentComponent,
    CommentDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      {path : 'car-parent' , component : CarParentComponent},
      {path : 'car-child' , component : CarChildComponent},
      {path : 'bike-parent' , component : BikeParentComponent},
      {path : 'bike-child' , component : BikeChildComponent},
      {path : 'laptop-parent' , component : LaptopParentComponent},
      {path : 'laptop-child' , component : LaptopChildComponent},
      {path : 'mobile-parent' , component : MobileParentComponent},
      {path : 'mobile-child' , component : MobileChildComponent},
      {path : 'movie-parent' , component: MovieParentComponent},
      {path : 'movie-child' , component: MovieChildComponent},
      {path : 'comment', component: CommentDetailsComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
