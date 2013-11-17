(function() {

  jQuery(function($) {
    var $table, productListUrl;
    $table = $('.container table');
    productListUrl = $table.data('list');
    return $.get(productListUrl, function(products) {
      return $.each(products, function(index, eanCode) {
        var row;
        row = $('<tr/>').append($('<td/>').text(eanCode));
        return $table.append(row);
      });
    });
  });

}).call(this);
