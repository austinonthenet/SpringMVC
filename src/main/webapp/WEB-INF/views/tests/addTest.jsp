<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

        <!-- Content Row -->
        <div class="mb-4 mt-4">
                <div class="card">
                    <h4 class="card-header">Enter The Test Details</h4>
                    
                        <form:form method="POST" 
				          action="/online-exam-app/tests/submit" modelAttribute="testForm">
				          <div class="card-body">
				             <table>
				                <tr>
				                    <td><form:label path="name">Name</form:label></td>
				                    <td><form:input path="name"/></td>
				                </tr>
				                <tr>
				                    <td><form:label path="description">Description</form:label></td>
				                    <td><form:input path="description"/></td>
				                </tr>
				            </table>
				            </div>	
				            <div class="card-footer">
					            <table>
					                <tr>
					                    <td><input type="submit" value="Submit" class="btn btn-primary"/></td>
				                    </tr>
			                    </table>
				            </div>
				        </form:form>
                                        
		        </div>
        </div>
        <!-- /.row -->
        

    </div>
    
    <!-- Footer -->
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>