import { Component, OnInit } from '@angular/core';
import { bbqInterface } from "../bbqInterface";

@Component({
  selector: 'app-bbq',
  templateUrl: './bbq.component.html',
  styleUrls: ['./bbq.component.css']
})
export class BbqComponent implements OnInit {
  currentFoodTruck = null;
  displayFoodTruckInfo(arr) {
    console.log("I click this");
    this.currentFoodTruck = arr;
    console.log(this.currentFoodTruck)
  }
  bbq: bbqInterface[] = [
    {
      name: "Ray Ray's Hog Pit",
      image: "https://www.grovecitysummit.com/wp-content/uploads/2016/05/5-CENTRAL-OHIO-FOOD-TRUCKS-TO-TRY-THIS-SUMMER.jpg",
      yelp: "https://www.yelp.com/biz/ray-rays-hog-pit-columbus-2?osq=Food+Trucks",
      website: "https://www.rayrayshogpit.com/"
    },
    {
      name: "SmokeOut BBQ",
      image: "https://static.wixstatic.com/media/9e7455_1a48afcbf8e8467c9c28bb42fb5ab5fd~mv2.jpg/v1/fill/w_488,h_226,al_c,q_80,usm_0.66_1.00_0.01/trailer_edited.webp",
      yelp: "https://www.yelp.com/biz/smokeout-bbq-baltimore?osq=SmokeOut+BBQ",
      website: "https://www.smokeoutbbq.com/"
    },
    {
      name: "Hogback Bbq Pit",
      image: "https://scontent.fcmh1-1.fna.fbcdn.net/v/t1.0-9/32712327_1981545438583451_6886655574356787200_o.jpg?_nc_cat=103&_nc_sid=8bfeb9&_nc_ohc=oAZmL1Pv4jYAX_a9SBi&_nc_ht=scontent.fcmh1-1.fna&oh=0fc4c4cda3f3eea6be09970d24c8ace0&oe=5F6FB855",
      yelp: "https://www.yelp.com/biz/hogback-bbq-pit-sunbury",
      website: "http://www.hogbackbbqpit.com/"
    },

  ]
  
  //foodTruckName = this.bbq[0];
  constructor() { }

  ngOnInit(): void {
  }
}
