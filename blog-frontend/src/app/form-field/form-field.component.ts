import { Component } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-form-field',
  templateUrl: './form-field.component.html',
  styleUrls: ['./form-field.component.css']
})
export class FormFieldComponent {

  heroForm = new FormGroup({
    email : new FormControl(''),
    firstName : new FormControl(''),
    lastName : new FormControl(''),
  });
}
