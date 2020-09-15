import { Component, OnInit } from '@angular/core';
import { healthyInterface } from "../healthyInterface";

@Component({
  selector: 'app-healthy',
  templateUrl: './healthy.component.html',
  styleUrls: ['./healthy.component.css']
})
export class HealthyComponent implements OnInit {
  currentFoodTruck = null;
  displayFoodTruckInfo(arr) {
    console.log("I click this");
    this.currentFoodTruck = arr;
    console.log(this.currentFoodTruck)
  }
  healthy: healthyInterface[] = [
    {
      name: "Kinetic",
      image: "https://s3-media0.fl.yelpcdn.com/bphoto/9yx2IYdN7_JQGImr4rMhMQ/o.jpg",
      yelp: "https://www.yelp.com/biz/kinetic-columbus",
      website: "https://www.kineticfoodtruck.com/"
    },
    {
      name: "The Little Kitchen",
      image: "https://images.squarespace-cdn.com/content/v1/598b5833197aea4997ad955d/1548450664775-7Q6BCK2QGPYMK47FMGFF/ke17ZwdGBToddI8pDm48kLkXF2pIyv_F2eUT9F60jBl7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z4YTzHvnKhyp6Da-NYroOW3ZGjoBKy3azqku80C789l0iyqMbMesKd95J-X4EagrgU9L3Sa3U8cogeb0tjXbfawd0urKshkc5MgdBeJmALQKw/IMG_6102-2.jpg?format=2500w",
      yelp: "https://www.yelp.com/biz/the-little-kitchen-columbus?osq=The+Little+Kitchen",
      website: "https://www.thelittlekitchentruck.com/"
    },
  ]
  
  constructor() { }

  ngOnInit(): void {
  }

}
