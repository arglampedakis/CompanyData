<%-- 
    Document   : navbar
    Created on : Nov 21, 2020, 7:16:20 PM
    Author     : RG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="/">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item" id="loc">
                <a class="nav-link" href="/locations/0">Λίστα Τοποθεσιών</a>
            </li>
            <li class="nav-item" id="dep">
                <a class="nav-link" href="/departments/0" tabindex="-1" aria-disabled="true">Λίστα Τμημάτων</a>
            </li>
            <li class="nav-item" id="emp">
                <a class="nav-link" href="/employees/0" tabindex="-1" aria-disabled="true">Λίστα υπαλλήλων</a>
            </li>
        </ul>
    </div>
</nav>
<script src="/js/navbar.js"></script>
