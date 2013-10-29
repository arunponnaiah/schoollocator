<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">
    <title>School Locator</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

    <!--
      IMPORTANT:
      This is Heroku specific styling. Remove to customize.
    -->
    <link href="http://heroku.github.com/template-app-bootstrap/heroku.css" rel="stylesheet">
    <!-- /// -->

</head>

<body>
<div class="container" align="center">
	<h3>School Locator</h3>
    <div class="row">
        <div class="span8 offset2">
		        
           <form action="searchSchool" method="post">
	            <table>
	            	<tr>
	            		<td>zipcode</td>
	            		<td><input type="text" name="zipcode"/></td>
	            		<td>type</td>
	            		<td>
	            			<select name="keyword">
	            				<option>kindergarten</option>
	            				<option>elementary</option>
	            				<option>middle school</option>
	            				<option>high school</option>
	            			</select>
	            		</td>
	            		<td>miles</td>
	            		<td>
	            			<select name="radius">
	            				<option>5</option>
	            				<option>10</option>
	            				<option>15</option>
	            				<option>20</option>
	            			</select>
	            		</td>
	            		<td>
	            			<input type="submit" class="btn btn-danger btn-mini" value="Search"/>
	            		</td>
	            </table>
	          </form> 
			  <c:if  test="${!empty schools}">
                <table class="table table-bordered table-striped">
                    <tbody>
                    <c:forEach items="${schools}" var="school">
                        <tr>
                            <td>${school.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>

</body>
</html>
