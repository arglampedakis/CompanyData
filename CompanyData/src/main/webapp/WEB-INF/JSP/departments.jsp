<%-- 
    Document   : departments
    Created on : Nov 21, 2020, 8:39:57 PM
    Author     : RG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Λίστα Tμημάτων</title>

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
                <div class="row my-4">
                    <div  class="col-4 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01">Διάλεξε Τοποθεσία:</label>
                        </div>
                        <select class="custom-select" id="locations">
                            <option value="0">Όλες</option>
                        </select>
                    </div>
                </div>

                <div class="row my-4">
                    <table id="myTable" class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Tμήμα</th>
                                <th scope="col" hidden=true>Τοποθεσία</th>
                                <th scope="col">Υπάλληλοι</th>
                            </tr>
                        </thead>
                        <tbody id="tBody">

                        </tbody>
                    </table>
                </div>
            </main>

        <jsp:include page="footer.jsp"></jsp:include>

        <script src="/js/departments.js"></script>

    </body>
</html>
