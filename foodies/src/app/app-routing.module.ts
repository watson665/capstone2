import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AmericanComponent } from './american/american.component';
import { BbqComponent } from './bbq/bbq.component';
import { BreakfastComponent } from './breakfast/breakfast.component';
import { DessertComponent } from './dessert/dessert.component';
import { HealthyComponent } from './healthy/healthy.component';
import { InternationalComponent } from './international/international.component';

const routes: Routes = [
  { path: "home", component: HomeComponent},
  { path: "american", component: AmericanComponent},
  { path: "bbq", component: BbqComponent},
  { path: "breakfast", component: BreakfastComponent},
  { path: "dessert", component: DessertComponent},
  { path: "healthy", component: HealthyComponent},
  { path: "international", component: InternationalComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full'},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
