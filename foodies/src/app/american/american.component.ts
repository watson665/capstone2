import { Component, OnInit } from '@angular/core';
import { americanInterface } from "../americanInterface";

@Component({
  selector: 'app-american',
  templateUrl: './american.component.html',
  styleUrls: ['./american.component.css']
})
export class AmericanComponent implements OnInit {
  currentFoodTruck = null;
  displayFoodTruckInfo(arr) {
    console.log("I click this");
    this.currentFoodTruck = arr;
    console.log(this.currentFoodTruck)
  }
  american: americanInterface[] = [
    {
    name: "Hot Mess Food Truck",
    image: "https://pbs.twimg.com/profile_images/1248762577968156672/WR3D1E2T_400x400.jpg",
    yelp: "https://www.yelp.com/biz/hot-mess-food-truck-columbus?osq=Hot+Mess+Food+Truck",
    website: "https://twitter.com/hotmessfoodtrck?lang=en"
    },
    {
    name: "The Cheesy Truck",
    image: "https://scontent.fcmh1-1.fna.fbcdn.net/v/t1.0-9/117646134_3488801907797187_2321369825907087426_o.jpg?_nc_cat=107&_nc_sid=9267fe&_nc_ohc=bbEZ_R1UGlkAX-IiJOV&_nc_ht=scontent.fcmh1-1.fna&oh=0a0ec5995a401c8bb5ccb1555e92ab5d&oe=5F7CEA00",
    yelp: "https://www.yelp.com/biz/the-cheesy-truck-columbus-2?osq=The+Cheesy+Truck",
    website: "https://www.thecheesytruck.com/"
    },
    {
    name: "The Tasty Good",
    image: "https://s3-media0.fl.yelpcdn.com/bphoto/A7Z-6gMEX4d3pJLdLMmuNQ/l.jpg",
    yelp: "https://www.yelp.com/biz/the-tasty-good-columbus?osq=The+Tasty+Good",
    website: "https://www.facebook.com/thetastygood/"
    },

  ]

/*
  chooseTruck(americans) {
    this.truck = americans;
    console.log(americans);
  }
*/
  constructor() { }

  ngOnInit(): void {
  }
  /*
  american = [
    {
      name: "Hot Mess Food Truck",
      image: " ",
      yelp: "https://www.yelp.com/biz/hot-mess-food-truck-columbus?osq=Hot+Mess+Food+Truck",
      website: "https://twitter.com/hotmessfoodtrck?lang=en"
    },
    {
      name: "The Cheesy Truck",
      image: "https://thebreakfastgrubguy.files.wordpress.com/2013/06/101_1540.jpg",
      yelp: "https://www.yelp.com/biz/the-cheesy-truck-columbus-2?osq=The+Cheesy+Truck",
      website: "https://www.thecheesytruck.com/"
    },
    {
      name: "The Tasty Good",
      image: "https://s3-media0.fl.yelpcdn.com/bphoto/A7Z-6gMEX4d3pJLdLMmuNQ/l.jpg",
      yelp: "https://www.yelp.com/biz/the-tasty-good-columbus?osq=The+Tasty+Good",
      website: "https://www.facebook.com/thetastygood/"
    },

  ]*/

}
