import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  baseURL = 'http://localhost:8080/librarymanagement';
  isALoggedIn = false;
  isuLoggedIn = false;
  isLLoggedIn = false;
  home = true;
  constructor(private http: HttpClient) { }

  isAdminLoggedIn() {
    if (this.isALoggedIn) {
      return true;
    }
    return false;
  }


  isUserLoggedIn() {
    if (this.isuLoggedIn) {
      return true;
    }
    return false;
  }

  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

}
