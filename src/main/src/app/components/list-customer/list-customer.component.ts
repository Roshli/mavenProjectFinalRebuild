import { Component, OnInit } from '@angular/core';
import { CustomerService} from '../../shared-service/customer.service';
import { Customer } from '../../customer.model';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  private customers:Customer[];
  module2 = new Customer();

  constructor(private _customerService:CustomerService) { }

  ngOnInit() {
    this.module2 = this._customerService.getter();
  }
  processFormView()
  {
    this._customerService.viewCustomer(this.module2.tpNumber).subscribe((customers)=>{console.log(customers);}, (error)=>{console.log(error)})

  }
  getCustomer()
  {
    this._customerService.setter(this.module2);
  }

}
