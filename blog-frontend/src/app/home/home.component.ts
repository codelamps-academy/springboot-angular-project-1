import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-home',
  template: `
   <h2> User List</h2>
   <div>
<!--     <app-users-list users = "users"-->
<!--                     (user)="selectUser($event)"/>-->
   </div>
  `,
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

  // users : User[] = [];

  // constructor(private userService : UserService) {
  // }

  ngOnInit(): void {
    // this.userService.getUser()
    //   .subscribe(users => this.users = users);
  }
  //
  // selectUser(user : User){
  //   // action
  // }

}
