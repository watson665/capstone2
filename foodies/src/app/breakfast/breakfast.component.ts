import { Component, OnInit } from '@angular/core';
import { breakfastInterface} from "../breakfastInterface";

@Component({
  selector: 'app-breakfast',
  templateUrl: './breakfast.component.html',
  styleUrls: ['./breakfast.component.css']
})
export class BreakfastComponent implements OnInit {
  currentFoodTruck = null;
  displayFoodTruckInfo(arr) {
    console.log("I click this");
    this.currentFoodTruck = arr;
    console.log(this.currentFoodTruck)
  }
  breakfast: breakfastInterface[] = [
    {
      name: "Holy Crepes",
      image: "https://le-cdn.website-editor.net/719be0e1f33a4346b44ede4f6665108b/dms3rep/multi/opt/holy+crepes+food+truck+columbus+ohio-960w.jpg",
      yelp: "https://www.yelp.com/biz/holy-crepes-columbus",
      website: "https://www.holycrepescolumbus.com/"
    },
    {
      name: "Tupelo Doughnuts",
      image: "https://img1.wsimg.com/isteam/ip/2cb7456e-947b-4a9a-a728-fda23d13ba29/IMG_1186.jpg/:/cr=t:0%25,l:0%25,w:100%25,h:100%25/rs=h:750,cg:true",
      yelp: "https://www.yelp.com/biz/tupelo-doughnuts-columbus?osq=Tupelo+Doughnuts",
      website: "https://tupelodoughnuts.com/"
    },
    {
      name: "Broke Johnny Food Truck",
      image: "https://scontent.fcmh1-1.fna.fbcdn.net/v/t1.0-9/78958174_2790135484358429_357039579049492480_o.jpg?_nc_cat=104&_nc_sid=9267fe&_nc_ohc=d-QuP9ea-ccAX9M8Z0F&_nc_ht=scontent.fcmh1-1.fna&oh=27c9b032eb9b08c06b4b89f526142ccc&oe=5F6E8451",
      yelp: "https://www.yelp.com/biz/broke-johnny-food-truck-columbus",
      website: "http://www.brokejohnnytruck.com/"
    },
  ]

  constructor() { }

  ngOnInit(): void {
  }
}
