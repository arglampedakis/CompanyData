<%-- 
    Document   : employees
    Created on : Nov 21, 2020, 10:21:30 PM
    Author     : RG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Λίστα Υπαλλήλων</title>

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
                    <div  class="col-3 input-group">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01">Διάλεξε Τμήμα:</label>
                        </div>
                        <select class="custom-select" id="departments">
                            <option value="0">Όλα</option>
                        </select>
                    </div>
                    <div class="col-3">
                        <input id="lastname" type="text" class="form-control" placeholder="Επώνυμο">
                    </div>
                    <div class="col-3">
                        <input id="firstname" type="text" class="form-control" placeholder="Όνομα">
                    </div>
                    <div class="col-3">
                        <button class="btn btn-sm btn-outline-info" id="search-btn">Αναζήτηση</button>
                    </div>

                </div>
                <div class="row my-4">
                    <table id="myTable" class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Επώνυμο</th>
                                <th scope="col">Όνομα</th>
                                <th scope="col">Εργασία</th>
                                <th scope="col">Ημ/α πρόσληψης</th>
                                <th scope="col">Ετήσιος Μισθός</th>
                                <th scope="col">Ετήσιες Προμήθειες</th>
                                <th scope="col">Κωδικός Τμήματος</th>
                                <th scope="col" >Κωδικός Manager</th>
                                <th scope="col" >Λεπτομέρειες</th>
                            </tr>
                        </thead>
                        <tbody id="tBody">

                        </tbody>
                    </table>
                </div>

            </main>
        <jsp:include page="footer.jsp"></jsp:include>

        <script src="/js/employees.js"></script>

    </body>
</html>
