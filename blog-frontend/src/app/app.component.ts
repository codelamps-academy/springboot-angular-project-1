import { Component } from '@angular/core';
import {AntiHero} from "./anti-hero/models/anti-hero.interface";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'blog-frontend';
  data : AntiHero[] = [
    {
      firstName :"Andre",
      lastName: "Brillianto",
      house : "Indonesia",
      knownAd: "Venom"
    }
  ]

}
