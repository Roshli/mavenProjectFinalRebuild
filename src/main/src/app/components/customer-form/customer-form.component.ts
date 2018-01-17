import { Component, OnInit } from '@angular/core';
import {Customer} from '../../customer.model';
import {CustomerService} from '../../shared-service/customer.service';
import {Route, Router} from '@angular/router';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {
  private customer:Customer;
 model = new Customer();
   //customer = new Customer();

  constructor(private _customerService:CustomerService, private _router:Router) { }
 // newCustomer()
  //{
  //  let customer = new Customer( 1,'',1,'','' );
   // this._customerService.setter(customer);
  //}

  ngOnInit() {
   this.customer = this._customerService.getter();
  }

    processForm()
    {
      //if(this.customer.tpNumber == undefined)

        this._customerService.insertCustomer(this.model).subscribe((model)=>{console.log(model);},(error)=>{console.log(error);})
        this._router.navigate(['/home'])
    }
    get CurrentCustomer(){
      return JSON.stringify(this.model);
    }
    newCustomer()
    {
      //let customer = new Customer();
      this._customerService.setter(this.model);
    }
}
