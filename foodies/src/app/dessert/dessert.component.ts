import { Component, OnInit } from '@angular/core';
import { dessertInterface } from "../dessertInterface";

@Component({
  selector: 'app-dessert',
  templateUrl: './dessert.component.html',
  styleUrls: ['./dessert.component.css']
})
export class DessertComponent implements OnInit {
  currentFoodTruck = null;
  displayFoodTruckInfo(arr) {
    console.log("I click this");
    this.currentFoodTruck = arr;
    console.log(this.currentFoodTruck)
  }
  dessert: dessertInterface[] = [
    {
      name: "Graeter's Food Truck",
      image: "https://s3-media0.fl.yelpcdn.com/bphoto/UFpT2-0kn5ludsMihkRpIA/l.jpg",
      yelp: "https://www.yelp.com/biz/graeters-food-truck-cincinnati?osq=Graeter%27s+Food+Truck",
      website: "https://www.graeters.com/food-trucks"
    },
    {
      name: "Sweet Cheese",
      image: "https://s3-media0.fl.yelpcdn.com/bphoto/HuMTu9SmQiLE4IeD3EDCMA/o.jpg",
      yelp: "https://www.yelp.com/biz/sweet-cheese-columbus",
      website: "https://www.eatsweetcheese.com/"
    },
    {
      name: "Chilljoy Frozen Treatery",
      image: "https://s3-media0.fl.yelpcdn.com/bphoto/V6huroozOzBo9wMs7f7-Vg/o.jpg",
      yelp: "https://www.yelp.com/biz/chilljoy-frozen-treatery-columbus?osq=Food+Truck+Dessert",
      website: "https://chilljoyft.com/"
    },

  ]
  constructor() { }

  ngOnInit(): void {
  }
  
}
