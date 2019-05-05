$('#navmenu-toggle').click(function(){
    $('#main-navmenu').toggleClass('toggled')
    $(this).toggleClass('fa-bars')
    $(this).toggleClass('fa-times')
})


$('.navmenu-item.dropable').click(function(){
    let data_target = $(this).data('target')

    $(`#${data_target}`).toggleClass('toggled')
})