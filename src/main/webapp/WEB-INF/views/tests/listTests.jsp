<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<html>

<head>

	<title>Delhoyo Webapp</title>
	<!-- META JS and CSS -->
	<%@ include file="/WEB-INF/views/common/metajscss.jsp"%>

</head>



<body>
	
	<!-- Navigation --> 
    <%@ include file="/WEB-INF/views/common/navbar.jsp"%>
    
    <!-- Page Content -->
    <div class="container">
      <div class="mb-4 mt-4">
        <div class="card h-100">
            <h4 class="card-header">Test Lists</h4>
			<table class="table">
				<tr>
					<th>Name</th>
					<th>Category</th>
					<th>No. of Questions</th>
					<th>Time Limit</th>
					<th>Passing Score %</th>
				</tr>
				<c:forEach items="${Tests}" var="test" varStatus="tagStatus">
				  <tr>
				    <td>${test.testName}</td>
				    <td>${test.categoryId}</td>
				    <td>${test.questionsLimit}</td>
				    <td>${test.timeLimitMins}</td>
				    <td>${test.passingScore}</td>
				  </tr>
				</c:forEach>
			</table>
                    
        </div>
      </div>
    </div>
    
    <!-- Footer -->
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>