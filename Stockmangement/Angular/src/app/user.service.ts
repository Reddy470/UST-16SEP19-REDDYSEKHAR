import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
  constructor(private http: HttpClient ) { }



  

  addproduct(add): Observable<any>{
    return this.http.post('http://localhost:8080/add',add);
  }

  getData(): Observable<any>{
    return this.http.get('http://localhost:8080/getall');
  }


  updateUser( data) {
    return this.http.put('http://localhost:8080/update',data);
  }

  searchProduct(name) {
   return this.http.get(`http://localhost:8080/search?name=${name}`);

  }


}
