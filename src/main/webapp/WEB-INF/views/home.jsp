<%@ include file="/WEB-INF/views/include.jsp"%>
<html>

<head>

	<title>Resmy's Online Exam Application</title>
	<!-- META JS and CSS -->
	<%@ include file="/WEB-INF/views/common/metajscss.jsp"%>
	
	  <!-- Bootstrap -->
		<%-- <link rel="stylesheet" type="text/css"  href="<%=request.getContextPath()%>/resources/css/bootstrap.css"> --%>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/fonts/font-awesome/css/font-awesome.css">
		
		<!-- Stylesheet  ================================================== -->
		<link rel="stylesheet" type="text/css"  href="<%=request.getContextPath()%>/resources/css/style.css">
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/prettyPhoto.css">
		<link href='http://fonts.googleapis.com/css?family=Lato:400,700,900,300' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300' rel='stylesheet' type='text/css'>
		
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.1.11.1.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/bootstrap.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/SmoothScroll.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easypiechart.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.prettyPhoto.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.isotope.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.counterup.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/waypoints.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jqBootstrapValidation.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/contact_me.js"></script> 
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/main.js"></script>

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

	<!-- Navigation --> 
    <%@ include file="/WEB-INF/views/common/navbar.jsp"%>
    
	<!-- Header -->
	<header id="header">
	  <div class="intro">
	    <div class="container">
	      <div class="row">
	        <div class="intro-text">
	          <h1>Hello, welcome to <span class="name">Resmy's Online Exam Portal</span></h1>
	          <p>Center for assessments and certifications on all popular programming languages and frameworks</p>
	          <a href="#about" class="btn btn-default btn-lg page-scroll">Learn More</a> </div>
	      </div>
	    </div>
	  </div>
	</header>
	
    <!-- Navigation 2 TBD -->
	
	<div id="skills" class="text-center">
	  <div class="container">
	     <div class="section-title center">
		      <h2>Tests Offered</h2>
		      <hr>
		    </div>
		    <div class="row">
	   	  	<div class="col-md-4 col-sm-6 skill"> <span class="chart" data-percent="60"> <span class="percent">60</span> </span>
	        <h4>Java</h4>
	      	</div>
		    <div class="col-md-4 col-sm-6 skill"> <span class="chart" data-percent="50"> <span class="percent">50</span> </span>
	        <h4>Spring</h4>
	      	</div>
	      	<div class="col-md-4 col-sm-6 skill"> <span class="chart" data-percent="50"> <span class="percent">50</span> </span>
	        <h4>MVC</h4>
	      	</div>
	      	<div class="col-md-4 col-sm-6 skill"> <span class="chart" data-percent="40"> <span class="percent">40</span> </span>
	        <h4>JSP</h4>
	      	</div>
	      	<div class="col-md-4 col-sm-6 skill"> <span class="chart" data-percent="30"> <span class="percent">30</span> </span>
	        <h4>maven</h4>
	      	</div>
	 	</div>
	 	   
	  </div>
	</div>
	
	<!-- Achievements Section -->
	<div id="achievements" class="text-center">
	  <div class="container">
	    <div class="section-title center">
	      <h2>Some Stats</h2>
	      <hr>
	    </div>
	    <div class="row">
	      <div class="col-md-3 col-sm-3 wow fadeInDown" data-wow-delay="200ms">
	        <div class="achievement-box"> <span class="count">35</span>
	          <h4>Tests available</h4>
	        </div>
	      </div>
	      <div class="col-md-3 col-sm-3 wow fadeInDown" data-wow-delay="400ms">
	        <div class="achievement-box"> <span class="count">20000</span>
	          <h4>Number of questions</h4>
	        </div>
	      </div>
	      <div class="col-md-3 col-sm-3 wow fadeInDown" data-wow-delay="600ms">
	        <div class="achievement-box"> <span class="count">4035</span>
	          <h4>Number of tests taken to date</h4>
	        </div>
	      </div>
	      <div class="col-md-3 col-sm-3 wow fadeInDown" data-wow-delay="800ms">
	        <div class="achievement-box"> <span class="count">99.999</span>
	          <h4>Application Uptime</h4>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	
	
	<!-- Contact Section -->
	<div id="contact" class="text-center">
	  <div class="container">
	    <div class="section-title center">
	      <h2>Contact</h2>
	       <i class="fa fa-envelope-o fa-2x"></i> info@company.com 
	       <i class="fa fa-map-marker fa-2x"></i> Madrid,Spain
	       <i class="fa fa-phone fa-2x"></i> +1 123 456 1234
	       	
      	</div>
	      

	      <div class="clearfix"></div>
	     <h3>Leave me a message <a href="<spring:url value ="/contact"/>">here</a></h3>
	    </div>
	    
	      <div class="social">
	        <ul>
	          <li><a href="#"><i class="fa fa-facebook"></i></a></li>
	          <li><a href="#"><i class="fa fa-twitter"></i></a></li>
	          <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
	          <li><a href="https://github.com/pdelho/"><i class="fa fa-github"></i></a></li>
	          <li><a href="#"><i class="fa fa-instagram"></i></a></li>
	          <li><a href="https://www.linkedin.com/in/pablodelhoyo/"><i class="fa fa-linkedin"></i></a></li>
	        </ul>
	      </div>
	    
	  </div>
	
	<!-- Footer -->
	<div id="footer">
	  <div class="container text-center">
	    <div class="fnav">
	      <p>Copyright &copy; 2016 John Doe. Designed by <a href="http://www.templatewire.com" rel="nofollow">TemplateWire</a></p>
	    </div>
	  </div>
	</div>
	
</body>
</html>
    