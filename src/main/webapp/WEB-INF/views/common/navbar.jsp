<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="<spring:url value ="/"/>">Resmy's Online Exam Application</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <%-- <li class="nav-item<%=request.getRequestURI().endsWith("/about.jsp") ? " active " : " " %>">
                    <a class="nav-link" href="<spring:url value ="/about"/>">About</a>
                </li> --%>         
                <li class="nav-item<%=request.getRequestURI().endsWith("/home.jsp") ? " active " : " " %>">
                    <a class="nav-link" href="<spring:url value ="/home"/>">Home</a>
                </li> 
                <li class="nav-item<%=request.getRequestURI().endsWith("/contact.jsp") ? " active " : " " %>">
                    <a class="nav-link" href="<spring:url value ="/contact"/>">Profile</a>
                </li>
                <%--
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle<%=request.getRequestURI().contains("/coding") ? " active " : " " %>" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Coding
                        </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                        <a class="dropdown-item<%=request.getRequestURI().contains("/coding/jQuery") ? " active " : " " %>" href="<spring:url value ="/coding/jQuery"/>">jQuery</a>
                    </div>
                </li>
                 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Admin
                        </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownBlog">
                        <a class="dropdown-item" href="https://github.com/pdelho/">Manage Users</a>
                        <a class="dropdown-item" href="https://www.hackerrank.com/pablodelhoyo">Manage Tests</a>
                        <a class="dropdown-item" href="https://blackrockdigital.github.io/startbootstrap-modern-business">Stats</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>