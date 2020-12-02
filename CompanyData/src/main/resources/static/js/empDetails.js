$('document').ready(function () {

    let id = getIdFromCurrentUrl();

    loadEmployeeByEmpid(id);

    function getIdFromCurrentUrl() {
        let curUrl = $(location).attr('href');
        let arr = curUrl.split("/");
        return arr[arr.length - 1];
    }

    function loadEmployeeByEmpid(empid) {
        $.ajax({
            type: "GET",
            url: "/employee/empid/" + empid,
            dataType: "xml",
            success: appendToBody,
            error: error
        });
    }

    function appendToBody(employee) {
        let hiredate = $(employee).find('hiredate').text();
        let hrdate = new Date(hiredate);
        let date = hrdate.toLocaleDateString();

        $("#empid").val($(employee).find('empid').text());
        $("#lastname").val($(employee).find('lastname').text());
        $("#firstname").val($(employee).find('firstname').text());
        $("#job").val($(employee).find('job').text());
        $("#hiredate").val(date);
        $("#salary").val($(employee).find('salary').text());
        $("#comm").val($(employee).find('comm').text());
        $("#deptid").val($(employee).find('deptid').text());
        $("#mngid").val($(employee).find('mngid').text());
    }

    function error() {
        console.error("Bad request or Employee not found.");
    }
});