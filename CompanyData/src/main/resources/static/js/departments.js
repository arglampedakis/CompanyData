$('document').ready(function () {
    let dropdown = $("#locations");
    fillLocSelections();

    let id = getIdFromCurrentUrl();

    if (id === "0") {
        loadAllDepartments();
    } else {
        loadDepartmentByLocid(id);
    }

    function getIdFromCurrentUrl() {
        let curUrl = $(location).attr('href');
        let arr = curUrl.split("/");
        return arr[arr.length - 1];
    }

    function fillLocSelections() {

        $.ajax({
            type: "GET",
            url: "/location/all",
            dataType: "xml",
            success: fillSelections,
            error: error
        });
    }


    function fillSelections(locations) {

        $(locations).find('item').each(function () {

            let locid = $(this).find('locid').text();

            let locname = $(this).find('locname').text();

            let option = `<option value="` + locid + `">` + locname + `</option>`;
            dropdown.append(option);
        });

        dropdown.val(id);
        dropdown.change();

    }

    function loadAllDepartments() {
        $.ajax({
            type: "GET",
            url: "/department/all",
            dataType: "xml",
            success: displayDepartments,
            error: error
        });
    }

    function loadDepartmentByLocid(locid) {
        $.ajax({
            type: "GET",
            url: "/department/locid/" + locid,
            dataType: "xml",
            success: displayDepartments,
            error: error
        });
    }

    function displayDepartments(departments) {
        let tBody = $("#tBody");
        tBody.empty();
        $(departments).find('item').each(function () {

            let deptid = $(this).find('deptid').text();
            let dname = $(this).find('dname').text();
            let locid = $(this).find('locid').text();

            let result = `
                                <tr>
                                    <th value="` + deptid + `" >` + deptid + `</th>
                                    <td>` + dname + `</td>
                                    <td hidden value="` + locid + `"></td>
                                    <td><a href="/employees/` + deptid + `">
                                        <button type="button" class="btn btn-outline-info">
                                        Υπάλληλοι
                                        </button></a>
                                    </td>                                
                                </tr>`;
            tBody.append(result);
        });
    }

    dropdown.change((e) => {
        let val = dropdown.val();
        if (val !== "0")
            loadDepartmentByLocid(val);
        else
            loadAllDepartments();
    });
    
    function error(){
        console.error("Bad request, or no results found.");
    }

});