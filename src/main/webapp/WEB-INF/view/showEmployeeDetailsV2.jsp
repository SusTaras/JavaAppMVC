<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
 <head>
   <title>Java</title>
   <meta charset="utf-8">
 </head>
 <body>
  <p>Hello, ${employee.name} ${employee.surname}</p>
  <p>You have a good salary ${employee.salary}$</p>
  <p> Are you working in ${employee.department} department? </p>
  <p>${employee.carMessage}</p>
  <ul>
      <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
      </c:forEach>
  </ul>
  <br><br>
  <img src=${employee.favouriteAnimal} />
 </body>
</html>
