import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { from } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserLoginService {
 private baseUrl='http://localhost:8080/abc';
  constructor(private http:HttpClient) { }
  public dologin(user){
    return this.http.post(this.baseUrl,user,{responseType:'text' as 'json'});
  }
}
