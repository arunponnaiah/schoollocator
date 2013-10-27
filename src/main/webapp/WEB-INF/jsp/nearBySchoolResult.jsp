<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head><title>Near by schools </title></head>
<body>
	<table>
 		<c:forEach items="${nearBySchools}" var="person">
        	 <tr>
            	 <td>${school.name}</td>
         	</tr>
     	</c:forEach>
     </table>
</body>
</html>