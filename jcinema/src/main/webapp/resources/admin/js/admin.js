$(function(){

    var btnMovieSearch = $('.btnMovieSearch');
    var btnClose = $('#searchBg .btnClose');
    var searchBg = $('#searchBg');

    btnMovieSearch.click(function(){
        searchBg.show();
    });

    btnClose.click(function(){
        searchBg.hide();
    });

});