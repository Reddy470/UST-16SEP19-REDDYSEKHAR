import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  firebaseUrl = 'https://reddysekhar-bc6a3.firebaseio.com/'

  constructor() { }
}
