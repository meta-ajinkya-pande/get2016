$(document).ready(function(){
    $("#name").change(fnShowName);
    $("#age").change(fnShowAge);
    $("#address").change(fnShowAddress);
});

function fnShowName() {
    var ans = $('#name').val();
    $('#result').append("Name : " + ans+"<br/>");
    $('#name').animate({backgroundColor: "red"}, 200);
    $('#name').animate({backgroundColor: "white"}, 200);
}

function fnShowAge() {
    var ans = $('#age').val();
    $('#result').append("Age : " +ans+"<br/>");
    $('#age').animate({backgroundColor: "red"}, 200);
    $('#age').animate({backgroundColor: "white"}, 200);
}

function fnShowAddress() {
    var ans = $('#address').val();
    $('#result').append("Address : " +ans+"<br/>");
    $('#address').animate({backgroundColor: "red"}, 200);
    $('#address').animate({backgroundColor: "white"}, 200);
}
