# RESTful-API-with-Role-based-Authentication
This is an RESTful API that uses role bases authentiction to see and update the endpoints <br>
<h2>Properties</h2>
<p>
  There are <b><i>two roles admin and user</i></b><br>
  Username & password for admin -> <b>admin & adminpass</b><br>
  Username & password for user -> <b>user & userpass</b><br>
  -> It has <b>four endpoints</b> <br>
  1. adduser<br>
  2. getall<br>
  3.  update/{id}<br>
  4.delete/{id}<br>
  It can perfom CRUD operation
</p>
<h2>Functionalities</h2>
<p>
  Change & update the database name accordingly in <b>application.properties</b><br>
  <u>User can only do:-</u><br>
  It can only <i><u>see & add new users</u></i> through <i><u>getall & adduser</u></i> endpoints respectively<br>
  <u>Admin can do:-</u><br>
  <i>
  See the user<br>
  Add new user<br>
  Update the user<br>
  Delete the user<br></i>
  through getall, adduser, update, delete respectively<br>
</p>
