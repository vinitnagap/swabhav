import { Component, OnInit } from '@angular/core';
import { IStudent } from "./IStudent";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  Student : IStudent = {}
  Students : IStudent[] = []
  ImagePath: string;
 
constructor(){
  this.ImagePath = '/assets/images/student.png'
}
  ngOnInit(): void {
  }
  uname:String="vinit";
  loadStudent(){
    this.Student={
      rollno:1, name:"Ramesh", cgpa:8
    }
  }
  loadStudents(){
    this.Students=[{
      rollno:1, name:"Ramesh", cgpa:8
    },{
      rollno:2, name:"Gopal", cgpa:7
    }]
  }

}
