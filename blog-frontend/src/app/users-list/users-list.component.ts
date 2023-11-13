import {Component, EventEmitter, Input, Output} from '@angular/core';

@Component({
  selector: 'app-users-list',
  template: `
  <table class="table">
    <tbody>
    <tr (click)="selectUser(user)" *ngFor="let user of users">
      <td> {{ user.firstName}} </td>
      <td>
        <span>{{user.lastName}}</span>
      </td>
    </tr>
    </tbody>
  </table>
  `,
  styleUrls: ['./users-list.component.css']
})
export class UsersListComponent {

  @Input() users : User[];

  @Output('user')
  userEmitter = new EventEmitter<User>();
  selectUser(user:User){
    this.userEmitter.emit(user);
  }
}
