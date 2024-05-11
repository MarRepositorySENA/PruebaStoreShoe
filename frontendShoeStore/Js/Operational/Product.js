
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9090/store/api/v1/store/operational/product/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#nameProduct").val(item.nameProduct)
        $("#description").val(item.description)
        $("#quantity").val(item.quantity)
        $("#price").val(item.price)
        $("#PercentageVat").val(item.vatPercentaget)
        $("#percentageDiscount").val(item.discountPercentage)
        $("#status").val(item.status == 'ACTIVO' ? '1' : '0')
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9090/store/api/v1/store/operational/product/',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `
                        <tr class="table-light">
                            <td>`+ item.id + `</td>
                            <td>`+ item.nameProduct + `</td>
                            <td>`+ item.description + `</td>
                            <td>`+ item.quantity + `</td>
                            <td>`+ item.price + `</td>
                            <td>`+ item.vatPercentaget + ` %</td>
                            <td>`+ item.discountPercentage + ` %</td>
                            <td>`+ (item.status === 'ACTIVO' ? 'Activo' : 'Inactivo') + `</td>
                            <td><button class="btnEdit" type="button" onclick="findById('`+item.id+`');" data-bs-toggle="modal"
                            data-bs-target="#modalProduct"><i class="fi fi-rr-pencil"></i></button></td>
                            <td><button class="btnDelete" type="button" onclick="deleteById('`+ item.id + `');"><i class="fi fi-rr-trash"></i></button></td>
                        </tr>
                        `;
        })
        $("#dataResult").html(registros);
    })
}

//Accion para eliminar un registro seleccionado 
function deleteById(id) {
    Swal.fire({
        title: '¿Está seguro?',
        text: "¡No podrá revertir esto!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Sí, eliminarlo!',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            $.ajax({
                url: 'http://localhost:9090/store/api/v1/store/operational/product/' + id,
                method: "DELETE",
                headers: {
                    "Content-Type": "application/json"
                }
            }).done(function (result) {
                const Toast = Swal.mixin({
                    toast: true,
                    position: 'top-end',
                    showConfirmButton: false,
                    timer: 4000,
                    timerProgressBar: true,
                    didOpen: (toast) => {
                        toast.addEventListener('mouseenter', Swal.stopTimer)
                        toast.addEventListener('mouseleave', Swal.resumeTimer)
                    }
                })

                Toast.fire({
                    icon: 'success',
                    title: 'Producto eliminado',
                });
                loadTable();
            })
        }
    })
}

//Accion de adicionar un registro
function save() {
    // Obtener el valor del campo de ID
    var id = $("#id").val();
    
    // Crear el objeto de datos a enviar
    var data = {
        id: $("#id").val(),
        nameProduct: $("#nameProduct").val(),
        description: $("#description").val(),
        quantity: $("#quantity").val(),
        price: $("#price").val(),
        vatPercentaget: $("#percentageVat").val(),
        discountPercentage: $("#percentageDiscount").val(),
        status: ($("#status").val() === '1') ? 'ACTIVO' : 'INACTIVO',
        createdAt: new Date(),
        updatedAt: new Date(),
        deletedAt: new Date()

    };
    
    // Determinar si se debe realizar una solicitud POST o PUT
    var method = (id !== "") ? "PUT" : "POST";
    var url = (id !== "") ? "http://localhost:9090/store/api/v1/store/operational/product/" + id : "http://localhost:9090/store/api/v1/store/operational/product/";

    // Realizar la solicitud AJAX
    $.ajax({
        url: url,
        data: JSON.stringify(data),
        method: method,
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();
        //Limpiar formulario
        clearData();

        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 4000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        })

        Toast.fire({
            icon: (method === "POST") ? 'success' : 'warning',
            title: (method === "POST") ? 'Registro exitoso' : 'Modificación exitosa',
        });
    }).fail(function (jqXHR, textStatus, errorThrown) {
        // Si la respuesta es un error
        Swal.fire({
            icon: 'error',
            title: "Error",
            text: jqXHR.responseJSON.message,
        })
    });
}


function filters(){

    var url = 'http://localhost:9090/store_shoe/api/v1/store/operational/product/filters'

    var nombre = $("#filterNameProduct").val();
    if ($("#filterStatus").val() === '1'){
        var status = 'ACTIVO';
    }else if ($("#filterStatus").val() === '0'){
        var status= 'INACTIVO';
    }else {
        url = 'http://localhost:9090/store_shoe/api/v1/store/operational/product/filters'
    } ;

    if (name || description || status) {
        var data = {
            nameProduct: nombre,
            status: estado
        };

        $.ajax({
            url: url,
            method: "GET",
            data: data,
            headers: {
                "Content-Type": "application/json"
            }
        }).done(function (items) {
            var registros = "";
            items.forEach(function (item, index, array) {
                registros += `
                            <tr class="table-light">
                                <td>`+ item.id + `</td>
                                <td>`+ item.nameProduct + `</td>
                                <td>`+ item.descripcion + `</td>
                                <td>`+ item.cantidad + `</td>
                                <td>`+ item.price + `</td>
                                <td>`+ item.vatPercentaget + ` %</td>
                                <td>`+ item.discountPercentage + ` %</td>
                                <td>`+ (item.status == 'ACTIVO' ? 'Activo' : 'Inactivo') + `</td>
                                <td><button class="btnEdit" type="button" onclick="findById(`+ item.id + `);" data-bs-toggle="modal"
                                data-bs-target="#modalProduct"><i class="fi fi-rr-pencil"></i></button></td>
                                <td><button class="btnDelete" type="button" onclick="deleteById(`+ item.id + `);"><i class="fi fi-rr-trash"></i></button></td>
                            </tr>
                            `;
            })
            $("#dataResult").html(registros);
        });
    } else {
        loadTable();
    }
}

// Función para limpiar datos
function clearData() {
    $("#id").val("")
    $("#nameProduct").val("")
    $("#description").val("")
    $("#quantity").val("")
    $("#price").val("")
    $("#percentageVat").val("")
    $("#percentageDiscount").val("")
    $("#status").val("")
}

function cleanFilters(){
    $("#filterNameProduct").val(""),
    $("#filterDescription").val(""),
    $("#filterStatus").val("")
}