import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
// add these two lines below
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { AppComponent } from './app.component';
import { CreateComponent } from './create/create.component';
import { ListComponent } from './list/list.component';


@NgModule({
  declarations: [
    AppComponent,
    CreateComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule, FormsModule]
  ,
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
