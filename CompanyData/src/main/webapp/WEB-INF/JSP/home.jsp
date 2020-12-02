<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Home</title>

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
            <main class="container">
                <h2 class="my-4">Project: Υλοποίηση Εφαρμογής Παροχής Στοιχείων Προσωπικού</h2>

                <hr>

                <p>Στα πλαίσια αυτής της άσκησης υλοποιήθηκε μία Web εφαρμογή προβολής / παροχής δεδομένων για προσωπικό εταιρίας και μία εφαρμογή κατανάλωσης αυτών των δεδομένων μέσω services.</p>

                <hr>

                <p><strong>Οδηγίες εγκατάστασης και χρήσης</strong></p>

                <p>Για την εγκατάσταση και χρήση των υποσυστημάτων της εφαρμογής θα χρειαστείτε:</p>

                <ol>
                    <li>Εγκατάσταση του <strong>MySQL Workbench 8.0</strong> συμπεριλαμβανομένου και του <strong>MySQL server</strong> το οποίο θα βρείτε <a href="https://dev.mysql.com/downloads/mysql/">εδώ</a>. </li>
                    <li>Δημιουργίστε ένα <code>Standard TCP/IP</code> Connection με Hostname: <code>localhost</code> και Port:<code>3306</code></li>
                    <li><p>Εκτελέστε τα queries που θα βρείτε στο αρχείο: </p>

                        <blockquote>
                            <p><span class="border border-none">Q&amp;R\QnrJavaProject\src\main\resources\Q&amp;R-Query.sql</span></p>

                        </blockquote></li>
                    <li><p>Εγκατάσταση ενώς <strong>IDE</strong> (π.χ. <a href="https://netbeans.org">Netbeans</a> ή <a href="https://www.jetbrains.com/idea/">IntelliJ</a>) καθώς επίσης και του <a href="http://tomcat.apache.org">Apache Tomcat v9.0.35</a>. </p></li>
                    <li>Στη συνέχεια συνδέστε τον <strong>Apache Tomcat</strong> με το IDE. (π.χ. για το Netbeans θα βρείτε οδηγίες <a href="https://javapointers.com/how-to/add-tomcat-server-netbeans/">εδώ</a>.</li>
                    <li>Κάντε import το project στο IDE, στη συνέχεια build και run (ενδέχεται να χρειαστεί επανεκκίνηση του IDE μετά το build).</li>
                    <li>Ανοίξτε τον browser και θέστε url “<code>http://localhost:8080/</code>”</li>
                </ol>

                <hr>

                <p><u><strong>Υποσυστήματα Άσκησης</strong></u></p>

                <p><strong>1) Υποσύστημα Βάσης δεδομένων</strong></p>

                <p>Υλοποιήθηκε σε  MySQL και περιέχει τα ακόλουθα tables:</p>

                <ul>
                    <li>EMPLOYEES</li>
                </ul>

                <blockquote>
                    <table class="table table-bordered">
                        <thead class="thead-light">
                            <tr>
                                <th align="left">Empid</th>
                                <th align="left">Lastname</th>
                                <th align="left">Firstname</th>
                                <th align="left">JOB</th>
                                <th align="left">MNGID</th>
                                <th align="left">HIREDATE</th>
                                <th align="left">SALARY</th>
                                <th align="left">COMM</th>
                                <th align="left">DEPTID</th>
                            </tr>
                        </thead>
                        <tbody><tr>
                                <td align="left">Κωδ. εργαζόμενου</td>
                                <td align="left">Επώνυμο</td>
                                <td align="left">Όνομα</td>
                                <td align="left">Εργασία</td>
                                <td align="left">Κωδ. Manager</td>
                                <td align="left">Ημ/ία Πρόσληψης</td>
                                <td align="left">Ετήσιος Μισθός</td>
                                <td align="left">Ετήσιες Προμήθειες</td>
                                <td align="left">Κωδ. Τμήματος</td>
                            </tr>
                        </tbody></table>

                </blockquote>

                <ul>
                    <li>DEPARTMENTS</li>
                </ul>

                <blockquote>
                    <table class="table table-bordered">
                        <thead class="thead-light">
                            <tr>
                                <th align="left">DeptId</th>
                                <th align="left">Dname</th>
                                <th align="left">LocId</th>
                            </tr>
                        </thead>
                        <tbody><tr>
                                <td align="left">Κωδικός τμήματος</td>
                                <td align="left">Όνομα Τμήματος</td>
                                <td align="left">Κωδικός Τοποθεσίας</td>
                            </tr>
                        </tbody></table>

                </blockquote>

                <ul>
                    <li>DEPT_LOCATIONS</li>
                </ul>

                <blockquote>
                    <table class="table table-bordered">
                        <thead class="thead-light">
                            <tr>
                                <th align="left">LocId</th>
                                <th align="left">Locname</th>
                            </tr>
                        </thead>
                        <tbody><tr>
                                <td align="left">Κωδικός Τοποθεσίας</td>
                                <td align="left">Ονομασία Τοποθεσίας</td>
                            </tr>
                        </tbody></table>

                </blockquote>

                <p><em>Η επικοινωνία των εφαρμογών / υποσυστημάτων  με τη Βάση δεδομένων γίνεται με <strong>Spring Data JPA</strong>.</em></p>

                <hr>

                <p><strong>2) Υποσύστημα Προβολής καταλόγου προϊόντων (Web site)</strong></p>

                <blockquote>
                    <p>Υλοποιήθηκε Web εφαρμογή με χρήση <strong>JSP, Bootstrap, jQuery &amp; JavaScript</strong> και παρέχει τα ακόλουθα:</p>

                    <ul>
                        <li>Λίστα Τοποθεσιών</li>
                        <li>Λίστα Τμημάτων ανά Τοποθεσία</li>
                        <li>Λίστα υπαλλήλων ανά Τμήμα</li>
                        <li>Λεπτομέρειες υπαλλήλου</li>
                    </ul>
                </blockquote>

                <hr>

                <p><strong>3) Υποσύστημα Web Services</strong></p>

                <blockquote>
                    <p>Υλοποιήθηκε με SpringMVC, SpringBoot, Maven. <br>
                        Υλοποιήθηκαν REST Web Services που παρέχουν τις πληροφορίες της εφαρμογής, δηλαδή:</p>

                    <ul>
                        <li>Λίστα Τοποθεσιών</li>
                        <li>Λίστα τμημάτων συνολικά</li>
                        <li>Λίστα τμημάτων συνολικά</li>
                        <li>Λίστα υπαλλήλων ανά τμήμα</li>
                        <li>Λίστα υπαλλήλων προερχομένων από απλή αναζήτηση στο Ονοματεπώνυμο</li>
                        <li>Λεπτομέρειες υπαλλήλου</li>
                    </ul>
                </blockquote>

                <p class="mb-4 pb-4"><em>Ο προεπιλεγμένος επιστρεφόμενος τύπος δεδομένων για κάθε περίπτωση είναι <strong>XML</strong>, ενώ υπάρχει και δυνατότητα επιστροφής σε <strong>JSON</strong>.</em></p>
            </main>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
