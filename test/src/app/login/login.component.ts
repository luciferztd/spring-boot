import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserLoginService } from '../user-login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User =new User("","");
  message:any;
  constructor(private service:UserLoginService) { }

  ngOnInit() {
  }
public login(){
  let response=this.service.dologin(this.user);
  console.log(this.user)
  response.subscribe((data)=>this.message=data);
}
}
