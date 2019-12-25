import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { FooterComponent } from './footer/footer.component';
import { AddBookComponent } from './add-book/add-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { HomeComponent } from './home/home.component';
import { GetallBookComponent } from './getall-book/getall-book.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { FilterPipe } from './filter.pipe';
import { LogoutComponent } from './logout/logout.component';

import { DeletestudentComponent } from './deletestudent/deletestudent.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { AuthGuard } from './auth.guard';
import { BookRequestComponent } from './book-request/book-request.component';
import { ReqListComponent } from './req-list/req-list.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    UserComponent,
    LibrarianComponent,
    FooterComponent,
    AddBookComponent,
    UpdateBookComponent,
    HomeComponent,
    GetallBookComponent,
    SearchBookComponent,
    FilterPipe,
    LogoutComponent,
    DeletestudentComponent,
    RequestBookComponent,
    BookRequestComponent,
    ReqListComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'login', component : LoginComponent},
      {path : 'reg', component : RegisterComponent},
      {path : 'user', component : UserComponent, canActivate: [AuthGuard],data: { type: [ 'user'] }},
      {path : 'lib', component : LibrarianComponent,canActivate: [AuthGuard], data: { type: ['librarian'] }},
      {path : 'add', component : AddBookComponent},
      {path : 'update', component : UpdateBookComponent},
      {path : 'get', component : GetallBookComponent},
      {path : 'search', component : SearchBookComponent},
      {path : 'logout', component : LogoutComponent},
      {path : 'delete', component : DeletestudentComponent},
      {path : 'req', component : BookRequestComponent},
      {path : 'reqlist', component : ReqListComponent},


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
