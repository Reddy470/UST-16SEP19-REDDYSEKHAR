import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


import { AddProductComponent } from './add-product/add-product.component';
import { ModifyProductComponent } from './modify-product/modify-product.component';
import { SearchprodtnameComponent } from './searchprodtname/searchprodtname.component';
import { SerchCategoryComponent } from './serch-category/serch-category.component';
import { FilterPipe } from './filter.pipe';
import { SearchPipe } from './search.pipe';
import { CompanyPipe } from './company.pipe';
import { SearchCompanyComponent } from './search-company/search-company.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
   
    AddProductComponent,
    ModifyProductComponent,
    SearchprodtnameComponent,
    SerchCategoryComponent,
    FilterPipe,
    SearchPipe,
    CompanyPipe,
    SearchCompanyComponent,
    // HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
    
    {path : 'add', component : AddProductComponent},
    {path : 'get', component : ModifyProductComponent},
    {path : 'search', component : SearchprodtnameComponent},
    {path : 'catogory', component : SerchCategoryComponent},
     {path : 'company', component : SearchCompanyComponent},


      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
