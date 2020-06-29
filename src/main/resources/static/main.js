$('document').ready(function () {

    $('table #deleteButton').click(function (event) {
        event.preventDefault();
        var href=$(this).attr('href');
        $('#deletePlayerModal #deleteYes').attr('href',href);
        $('#deletePlayerModal').modal();
    });

    $('table #editButton').click(function (event) {
        event.preventDefault();
        var href=$(this).attr('href');

        $.get(href, function (newPlayer,status) {
            $('#numberEditInput').val(newPlayer.number);
            $('#firstNameEditInput').val(newPlayer.firstName);
            $('#lastNameEditInput').val(newPlayer.lastName);
            $('#passwordEditInput').val(newPlayer.password);
            $('#firstPositionEditInputGroup').val(newPlayer.firstPosition);
            $('#secondPositionEditInputGroup').val(newPlayer.secondPosition);
            $('#thirdPositionEditInputGroup').val(newPlayer.thirdPosition);

        });
        $('#editPlayerModal').modal();
    });

});

