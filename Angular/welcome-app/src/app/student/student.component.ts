import { Component, OnInit } from '@angular/core';
import { IStudent } from "./IStudent";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  Student : IStudent = []
  Students : IStudent[] = []
  ImagePath: string;
 
//   getStudents(){
//    const studentsList : IStudent[] = {
//       {rollno : 1,name : "Ram",cgpa : 9.5},
//       {rollno : 4,name : "Ravi",cgpa : 8.5}
//   }
// }
constructor(){
  this.ImagePath = '/assets/images/student.png'
}
  ngOnInit(): void {
  }
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
// export class Student implements IStudent{

//   constructor(public rollno:number,public name:String, public cgpa:number){}
//    getStudent(){
//     const student : IStudent = {
//       rollno : 1,
//       name : "Ram",
//       cgpa : 9.5
//     }
//     return student;
//   }
// }