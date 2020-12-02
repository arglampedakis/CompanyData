<%-- 
    Document   : empDetails
    Created on : Nov 22, 2020, 6:37:15 PM
    Author     : RG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Λεπτομέριες Υπαλλήλου</title>

        <!-- Bootstrap 4.5.0 CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <!-- jQuery 3.4.1 -->
        <script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous" ></script>
        <!-- Bootstrap 4.5.0 JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
    <body class="bg-light">
        <jsp:include page="navbar.jsp"></jsp:include>

            <main class="container my-4 py-2">
                <div class="row my-4 py-2">
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="empid">ID:</label>
                        </div>
                        <input id="empid"  disabled type="text" class="form-control">
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="firstname">Όνομα:</label>
                        </div>
                        <input id="firstname"  disabled type="text" class="form-control">
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="lastname">Επώνυμο:</label>
                        </div>
                        <input id="lastname"  disabled type="text" class="form-control">
                    </div>
                </div>
                <div class="row my-4 py-2">
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="job">Εργασία:</label>
                        </div>
                        <input id="job"  disabled type="text" class="form-control">
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="hiredate">Ημ/ια πρόσληψης:</label>
                        </div>
                        <input id="hiredate"  disabled type="text" class="form-control">
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="salary">Ετήσιος Μισθός:</label>
                        </div>
                        <input id="salary"  disabled type="text" class="form-control">
                        <div class="input-group-append">
                            <label class="input-group-text" for="salary">&euro;</label>
                        </div>
                    </div>
                </div>
                <div class="row my-4 py-2">
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="comm">Ετήσιες Προμήθειες:</label>
                        </div>
                        <input id="comm"  disabled type="text" class="form-control">
                        <div class="input-group-append">
                            <label class="input-group-text" for="comm">&euro;</label>
                        </div>
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="deptid">Κωδικός Τμήματος:</label>
                        </div>
                        <input id="deptid"  disabled type="text" class="form-control">
                    </div>
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="mngid">Κωδικός Manager:</label>
                        </div>
                        <input id="mngid"  disabled type="text" class="form-control">
                    </div>
                </div>
            </main>

        <jsp:include page="footer.jsp"></jsp:include>

        <script src="/js/empDetails.js"></script>
    </body>
</html>
