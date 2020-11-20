"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var customer_1 = require("./customer");
var myCustomerWithParam = new customer_1.Customer("abc", "xyz");
console.log(myCustomerWithParam.firstName);
console.log(myCustomerWithParam.lastName);
