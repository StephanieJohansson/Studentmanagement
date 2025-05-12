HOW TO USE THIS APP IN POSTMAN:

To create a student use endpoint http://localhost:8080/api/students and write in body: 
{
"name": "",
"email": ""
}
When youre making a GET call you'll see the students ID and courses etc, with that ID you can update the student with a PUT call and the same body as above and write the new name or email.
To DELETE a student use endpoint http://localhost:8080/api/students/{id}, and the student with said ID will be deleted.

To GET all courses use  http://localhost:8080/courses, you can also GET a course by its ID with endpoint /courses/{id}.
To POST a new course use the original endpoint and write it in the body like ex:
  {
    "name": "Mjukvaruutvecklare 24",
    "code": "MU24"
  }
  You can update a course by ID in the same way you update a student but with endpoint /courses/{id} and the right body. You DELETE a course with the same endpoint, it will be deleted by ID.

  
