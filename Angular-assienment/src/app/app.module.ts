import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { FormsModule,ReactiveFormsModule }  from '@angular/forms';
import { RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { HomeComponent } from './home/home.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';

import { ReactiveComponent } from './reactive/reactive.component';
import { TemplateComponent } from './template/template.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailesComponent } from './comment-detailes/comment-detailes.component';
import { SearchComponent }  from './search/search.component';
import { SourcesComponent }  from './sources/sources.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    HomeComponent,
    CountriesComponent,
    CategoriesComponent,
 
    ReactiveComponent,
    TemplateComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailesComponent,
    SearchComponent,
    SourcesComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'movies' , component : MoviesComponent},
      { path : 'home',component : HomeComponent },
      { path : 'countrie',component : CountriesComponent },
      
      { path :'react', component :ReactiveComponent},
      { path : 'temp', component : TemplateComponent},
      { path : 'flow', component :ParentComponent},
      { path:'comment', component:CommentDetailesComponent},
      { path : 'cat', component : CategoriesComponent},
      { path : 'sus',component:SourcesComponent},
      { path : 'mitha', component : SearchComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
