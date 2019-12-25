import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public isLibLoggedIn = false;
  public isuserLoggedIn = false;

  constructor(private http: HttpClient ) { }



  registerUser(user): Observable<any> {

    return this.http.post('http://localhost:8080/librarymanagement/reg', user);

  }

  loginUser(login): Observable<any> {

  return this.http.post('http://localhost:8080/librarymanagement/login', login);

  }

  addBook(add): Observable<any>{
    return this.http.put('http://localhost:8080/librarymanagement/addbook',add);
  }

  getData(): Observable<any>{
    return this.http.get('http://localhost:8080/librarymanagement/getall');
  }


  updateUser( data) {
    return this.http.put('http://localhost:8080/librarymanagement/update',data);
  }

  deleteUser(bid) {
   return this.http.delete(`${'http://localhost:8080/librarymanagement/delete'}/${bid}`);

  }

getStudent(sno){

  return this.http.delete(`${'http://localhost:8080/librarymanagement/delete'}/${sno}`);

}

userDetails(details){

  return this.http.get('http://localhost:8080/librarymanagement/userdetails',details);
}

request(bid): Observable<any>{

  return this.http.post('http://localhost:8080/librarymanagement/allocatebook',bid);

}

requestData(data): Observable<any> {

  return this.http.post('http://localhost:8080/librarymanagement/request', data);
}

reqList(): Observable<any> {

  return this.http.get('http://localhost:8080/librarymanagement/reqList');
}
approve(approveData): Observable<any> {
  console.log('in service', approveData);

  return this.http.post('http://localhost:8080/librarymanagement/approve', approveData);
}

reject(id): Observable<any> {
  console.log('in service', id);
  return this.http.delete(`${'http://localhost:8080/librarymanagement/reject'}/${id}`);
}
isLibrarianLoggedIn() {
  if (this.isLibLoggedIn) {
    return true;
  }
  return false;
}
isUserLoggedIn() {
  if (this.isuserLoggedIn) {
    return true;
  }
  return false;
}





}
