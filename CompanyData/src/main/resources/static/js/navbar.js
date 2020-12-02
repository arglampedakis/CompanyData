$('document').ready(function () {
    let curUrl = $(location).attr('href');
    let arr = curUrl.split("/");

    if (arr.length > 2) {
        let link = arr[arr.length - 2];

        switch (link) {
            case "locations":
                $("#loc").addClass("active");
                break;
            case "departments":
                $("#dep").addClass("active");
                break;
            case "employees":
                $("#emp").addClass("active");
                break;
            default:
        }
    }
});