import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { BreakfastComponent } from './breakfast/breakfast.component';
import { AmericanComponent } from './american/american.component';
import { BbqComponent } from './bbq/bbq.component';
import { HealthyComponent } from './healthy/healthy.component';
import { DessertComponent } from './dessert/dessert.component';
import { InternationalComponent } from './international/international.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BreakfastComponent,
    AmericanComponent,
    BbqComponent,
    HealthyComponent,
    DessertComponent,
    InternationalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
