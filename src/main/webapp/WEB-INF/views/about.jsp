<%@ include file="/WEB-INF/views/include.jsp"%>
<html>

<head>
	
	<title>Resmy's Online Exam Application</title>
	<!-- META JS and CSS -->
	<%@ include file="/WEB-INF/views/common/metajscss.jsp"%>	

</head>



<body>
	
	<!-- Navigation -->
    <%@ include file="/WEB-INF/views/common/navbar.jsp"%>
    
    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <h1 class="mt-4 mb-3">About Page <small>TBD</small></h1>

        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a  href="<spring:url value ="/"/>">Home</a>
            </li>
            <li class="breadcrumb-item active">About</li>
        </ol>

        <!-- Intro Content -->
        <div class="row">
            <div class="col-lg-6">
                <img class="img-fluid rounded mb-4" src="http://placehold.it/750x450" alt="">
            </div>
            <div class="col-lg-6">
                <h2>About Modern Business</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed voluptate nihil eum consectetur similique? Consectetur, quod, incidunt, harum nisi dolores delectus reprehenderit voluptatem perferendis dicta dolorem non blanditiis ex fugiat.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe, magni, aperiam vitae illum voluptatum aut sequi impedit non velit ab ea pariatur sint quidem corporis eveniet. Odit, temporibus reprehenderit dolorum!</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et, consequuntur, modi mollitia corporis ipsa voluptate corrupti eum ratione ex ea praesentium quibusdam? Aut, in eum facere corrupti necessitatibus perspiciatis quis?</p>
            </div>
        </div>
        <!-- /.row -->

        <!-- Team Members -->
        <h2>Our Team</h2>

        <div class="row">
            <div class="col-lg-4 mb-4">
                <div class="card h-100 text-center">
                    <img class="card-img-top" src="http://placehold.it/750x450" alt="">
                    <div class="card-body">
                        <h4 class="card-title">Team Member</h4>
                        <h6 class="card-subtitle mb-2 text-muted">Position</h6>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Possimus aut mollitia eum ipsum fugiat odio officiis odit.</p>
                    </div>
                    <div class="card-footer">
                        <a href="#">name@example.com</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 mb-4">
                <div class="card h-100 text-center">
                    <img class="card-img-top" src="http://placehold.it/750x450" alt="">
                    <div class="card-body">
                        <h4 class="card-title">Team Member</h4>
                        <h6 class="card-subtitle mb-2 text-muted">Position</h6>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Possimus aut mollitia eum ipsum fugiat odio officiis odit.</p>
                    </div>
                    <div class="card-footer">
                        <a href="#">name@example.com</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 mb-4">
                <div class="card h-100 text-center">
                    <img class="card-img-top" src="http://placehold.it/750x450" alt="">
                    <div class="card-body">
                        <h4 class="card-title">Team Member</h4>
                        <h6 class="card-subtitle mb-2 text-muted">Position</h6>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Possimus aut mollitia eum ipsum fugiat odio officiis odit.</p>
                    </div>
                    <div class="card-footer">
                        <a href="#">name@example.com</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- /.row -->

        <!-- Our Customers -->
        <h2>Our Customers</h2>
        <div class="row">
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
            <div class="col-lg-2 col-sm-4 mb-4">
                <img class="img-fluid" src="http://placehold.it/500x300" alt="">
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
    
    
    <!-- Footer -->
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>