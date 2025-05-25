function etiquetaSelect(select){
    console.log("etiquetaSelect ....");
    let index = select.selectedIndex;
    let option = select.options[index];
    let id = option.value;
    let nombre = option.text;
    let url = option.dataset.url;

    option.disabled = "disabled";
    select.selectedIndex = 0;

    agregarEtiqueta(id, nombre, url);

    let ids = $("#ids").val();

    if(ids == ""){
        $("#ids").val(id);
    }else{
        $("#ids").val(ids+", "+id);
    }
}

function agregarEtiqueta(id, nombre, url){
    let htmlString = '<div class="card col-md-1">\n' +
        '        <img src="{IMG}" class="card-img-top" alt="url aqui">\n' +
        '        <div class="card-body">\n' +
        '            <p class="card-text">{NOMBRE}</p>\n' +
        '        </div>\n' +
        '        <button type="button" class="btn danger" data-id="{ID}" onclick="eliminarEtiqueta(this)">Eliminar</button>\n' +
        '    </div>';

    htmlString = htmlString.replace("{IMG}", url);
    htmlString = htmlString.replace("{NOMBRE}", nombre);
    htmlString = htmlString.replace("{ID}", id);

    $("#etiquetas-container").append(htmlString);
}

function eliminarEtiqueta(btn){
    // let id pendiente!

}
