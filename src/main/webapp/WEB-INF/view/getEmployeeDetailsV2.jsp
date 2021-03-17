<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
 <head>
   <title>Java V2</title>
   <meta charset="utf-8">
 </head>
 <body>
  <h1> Hello, could you please provide your name? </h1>
  <br/>
  <form:form action="show" modelAttribute="employee">
    <form:input path="name" placeholder="Name"/>
    <form:errors path="name"/>
    <br/>
    <form:input path="surname" placeholder="Surname"/>
    <form:errors path="surname"/>
    <br/>
    <form:input path="salary" placeholder="Salary"/>
    <form:errors path="salary"/>
    <br/>
    <form:select path="department">
        <form:option value="Information Technology" label="IT"/>
        <form:option value="Sales" label="Sales"/>
        <form:option value="Human Resources" label="HR"/>
    </form:select>
    <br/>
    <form:select path="favouriteAnimal">
        <form:options items="${employee.animals}"/>
    </form:select>
    <br/><br/>
    Which car do you want? <br/>
    BMW<form:radiobutton path="car" value="BMW"/> <br/>
    Audi<form:radiobutton path="car" value="Audi"/> <br/>
    Bicycle<form:radiobutton path="car" value="Bicycle"/> <br/><br/>

    Which languages do you know? <br/>
    EN<form:checkbox path="languages" value="English"/> <br/>
    UA<form:checkbox path="languages" value="Ukrainian"/> <br/>
    RU<form:checkbox path="languages" value="Russian"/> <br/>
    DE<form:checkbox path="languages" value="Deutsch"/> <br/>
    <br/><br/>

    <form:input path="phoneNumber" placeholder="Phone number"/>
    <form:errors path="phoneNumber"/>
    <br/><br/>

    <form:input path="email" placeholder="Email"/>
    <form:errors path="email"/>
    <br/><br/>

    <input type="submit" />
  </form:form>

 </body>
</html>
