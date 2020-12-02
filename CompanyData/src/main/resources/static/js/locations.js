$('document').ready(function () {
    let id = getIdFromCurrentUrl();

    if (id === "0") {
        loadAllLocations();
    } else {
        loadLocation(id);
    }

    function getIdFromCurrentUrl() {
        let curUrl = $(location).attr('href');
        let arr = curUrl.split("/");
        return arr[arr.length - 1];
    }

    function loadAllLocations() {

        $.ajax({
            type: "GET",
            url: "/location/all",
            dataType: "xml",
            success: displayLocations,
            error: error
        });
    }

    function loadLocation(id) {
        $.ajax({
            url: "/location/locid/" + id,
            type: "GET",
            dataType: "xml",
            success: displayLocation,
            error: error
        });
    }

    let tBody = $("#tBody");

    function displayLocation(location) {
        tBody.empty();
        appendToBody(location);
    }
    function displayLocations(locations) {
        tBody.empty();

        $(locations).find('item').each(function () {
            appendToBody(this);

        });
    }

    function appendToBody(location) {
        let locid = $(location).find('locid').text();

        let locname = $(location).find('locname').text();

        let result = `
                                <tr>
                                    <th value="` + locid + `" >` + locid + `</th>
                                    <td>` + locname + `</td>
                                    <td><a href="/departments/` + locid + `">
                                        <button type="button" class="btn btn-outline-info operModalButtons">
                                        Tμήματα
                                        </button></a>
                                    </td>                                
                                </tr>`;
        tBody.append(result);
    }

    function error() {
        console.error("Bad request or no results");
    }

});