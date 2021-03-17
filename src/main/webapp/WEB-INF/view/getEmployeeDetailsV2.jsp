<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
 <head>
   <title>Java V2</title>
   <meta charset="utf-8">
 </head>
 <body>
  <h1> Hello, could you please provide your name? </h1>
  <br>
  <form:form action="show" modelAttribute="employee">
    <form:input path="name" placeholder="Name"/>
    <form:input path="surname" placeholder="Surname"/>
    <form:input path="salary" placeholder="Salary"/>
    <form:select path="department">
        <form:option value="Information Technology" label="IT"/>
        <form:option value="Sales" label="Sales"/>
        <form:option value="Human Resources" label="HR"/>
    </form:select>
    <form:select path="favouriteAnimal">
        <form:options items="${employee.animals}"/>
    </form:select>

    Which car do you want?
    BMW<form:radiobutton path="car" value="BMW"/>
    Audi<form:radiobutton path="car" value="Audi"/>
    Bicycle<form:radiobutton path="car" value="Bicycle"/>

    Which languages do you know?
    EN<form:checkbox path="languages" value="English"/>
    UA<form:checkbox path="languages" value="Ukrainian"/>
    RU<form:checkbox path="languages" value="Russian"/>
    DE<form:checkbox path="languages" value="Deutsch"/>

    <input type="submit" />
  </form:form>

 </body>
</html>
