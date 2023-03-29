function validaParanForm() {
    var valor = document.getElementById("valor").value;
    if (isNaN(valor)) {
        alert("O valor digitado não é um número válido.");
        return false;
    }
    return true;
}

