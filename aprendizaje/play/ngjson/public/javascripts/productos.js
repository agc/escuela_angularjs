jQuery(function($) {


    var $tabla= $('.container table');


    var productListUrl = $tabla.data('list');

    var insertaUnaFila = function(index,eanCode) {
            var fila = $('<tr/>').append($('<td/>').text(eanCode));
            $tabla.append(fila);
            cargaDetallesProducto(fila)

    };

    var cargaDetallesProducto=function(filaTabla) {
            var eanCode=filaTabla.text()




            var insertaDetalleProducto=function(producto) {

             filaTabla.append( $('<td/>').text(producto.name))
             filaTabla.append( $('<td/>').text(producto.description))

            };

            return $.get(productDetailsUrl(eanCode), insertaDetalleProducto);


        }


    var insertarFilasEnTabla= function(productos) {
              return $.each(productos,insertaUnaFila);
    };




    // usa un atributo en la tabla como plantilla para copiar
    // la URL y traer del servidor los datos

    var productDetailsUrl= function(eanCode) {
        return $tabla.data('details').replace( '0', eanCode)
    }

    var loadProductTable= function() {
        return $.get(productListUrl, insertarFilasEnTabla);
    }

    loadProductTable();

}) ;

