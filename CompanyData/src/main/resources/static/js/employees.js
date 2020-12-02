$('document').ready(function () {
    let tBody = $("#tBody");

    //Dropdown (departments)
    let dropdown = $("#departments");
    getDeptOptions();

    //on change event
    dropdown.change((e) => {
        let val = dropdown.val();
        if (val !== "0") {
            loadEmployeesByDeptid(val);
        } else {
            loadAllEmployees();
        }
    });

    //get preselected department from url. If ==0 then load emps from all depts
    let id = getIdFromCurrentUrl();

    if (id === "0") {
        loadAllEmployees();
    } else {
        loadEmployeesByDeptid(id);
    }

    //search by Lastname and Firstname
    let firstnameInp = $("#firstname");
    let lastnameInp = $("#lastname");
    let search = $("#search-btn");

    search.click(() => {
        let firstname = firstnameInp.val();
        let lastname = lastnameInp.val();

        $.ajax({
            type: "GET",
            url: "/employee/search/" + firstname + "/" + lastname,
            dataType: "xml",
            success: displayEmployees,
            error: function () {
                alert("Not found. Try a different name");
            }
        });
    });

    function getIdFromCurrentUrl() {
        let curUrl = $(location).attr('href');
        let arr = curUrl.split("/");
        return arr[arr.length - 1];
    }

    function getDeptOptions() {

        $.ajax({
            type: "GET",
            url: "/department/all",
            dataType: "xml",
            success: fillDropdown,
            error: error
        });
    }

    function fillDropdown(departments) {

        $(departments).find('item').each(function () {

            let deptid = $(this).find('deptid').text();

            let dname = $(this).find('dname').text();

            let option = `<option value="` + deptid + `">` + dname + `</option>`;
            dropdown.append(option);
        });
        //change dropdown selected value
        dropdown.val(id);
        dropdown.change();

    }

    function loadAllEmployees() {
        $.ajax({
            type: "GET",
            url: "/employee/all",
            dataType: "xml",
            success: displayEmployees,
            error: error
        });
    }

    function loadEmployeesByDeptid(deptid) {
        $.ajax({
            url: "/employee/deptid/" + deptid,
            type: "GET",
            dataType: "xml",
            success: displayEmployees,
            error: error
        });
    }

    function displayManager(event) {
        let id = event.target.id;
        let temp = id.split("-");
        let mngid = temp[1];
        tBody.empty();
        loadEmployeeByEmpid(mngid);
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

    function displayEmployees(employees) {
        tBody.empty();

        $(employees).find('item').each(function () {
            appendToBody(this);
        });
    }

    function appendToBody(employee) {
        let empid = $(employee).find('empid').text();
        let lastname = $(employee).find('lastname').text();
        let firstname = $(employee).find('firstname').text();
        let job = $(employee).find('job').text();

        let hiredate = $(employee).find('hiredate').text();
        let hrdate = new Date(hiredate);
        let date = hrdate.toLocaleDateString();

        let salary = $(employee).find('salary').text();
        let comm = $(employee).find('comm').text();
        let deptid = $(employee).find('deptid').text();
        let mngid = $(employee).find('mngid').text();

        let result = `
                                <tr>
                                    <th value="` + empid + `" >` + empid + `</th>
                                    <td>` + lastname + `</td>
                                    <td>` + firstname + `</td>
                                    <td>` + job + `</td>
                                    <td>` + date + `</td>
                                    <td>` + salary + `&euro;</td>
                                    <td>` + comm + `&euro;</td>
                                    <td><a href="/employees/` + deptid + `">
                                        <button type="button" class="btn btn-outline-info">
                                        ` + deptid + `
                                        </button></a>
                                    </td>
                                    <td>
                                        <button type="button" id="mng-` + mngid + `-` + empid + `" class="btn btn-outline-info">
                                        ` + mngid + `
                                        </button>
                                    </td> 
                                    <td><a href="/empdetails/` + empid + `">
                                        <button type="button" class="btn btn-outline-info">
                                        Λεπτομέρειες
                                        </button></a>
                                    </td>
        
                                </tr>`;
        tBody.append(result);
        $("#mng-" + mngid + "-" + empid).click(displayManager);
    }

    function error() {
        console.error("Bad request or no results found!");
    }

});