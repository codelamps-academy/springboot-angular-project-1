import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {ListComponent} from "./pages/list/list.component";
import {FormComponent} from "./pages/form/form.component";


const routes : Routes = [
  {
    path : "",
    redirectTo : "anti-heroes",
    component : ListComponent,
  },
  {
    path : "anti-heroes",
    loadChildren : () =>
      import("./anti-hero.module").then((m) => m.AntiHeroModule),
  }
];

@NgModule({
  declarations: [ListComponent, FormComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports : [RouterModule]
})
export class AntiHeroRoutingModule { }
