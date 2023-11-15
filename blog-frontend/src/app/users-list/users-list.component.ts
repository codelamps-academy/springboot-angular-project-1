import {Component, EventEmitter, Input, Output} from '@angular/core';

@Component({
  selector: 'app-users-list',
  template: `
<!--  <table class="table">-->
<!--    <tbody>-->
<!--&lt;!&ndash;    <tr (click)="selectUser(user)" *ngFor="let user of users">&ndash;&gt;-->
<!--      <td> {{ user}} </td>-->
<!--      <td>-->
<!--        <span>{{user}}</span>-->
<!--      </td>-->
<!--    </tr>-->
<!--    </tbody>-->
<!--  </table>-->
  `,
  styleUrls: ['./users-list.component.css']
})
export class UsersListComponent {

  // @Input() users : User[];

  // @Output('user')
  // userEmitter = new EventEmitter<User>();
  // selectUser(user:User){
  //   this.userEmitter.emit(user);
  // }
}
