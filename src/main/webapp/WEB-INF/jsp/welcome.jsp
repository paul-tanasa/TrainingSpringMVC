<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>SpringMVC DEMO</title>
</head>
<body>
<p>Hello World</p>

<c:choose>
    <c:when test="${not empty message}">
        <c:out value="${message}"/>
    </c:when>
    <c:otherwise>
        <c:out value="Default message"/>
    </c:otherwise>
</c:choose>

<div class="id">
    <p> Another great div </p>
</div>
<div>
	<a href="./login" style="background-color: black; color: white; width: 30px; height: 10px;">Login</a>
</div>
</body>
</html>