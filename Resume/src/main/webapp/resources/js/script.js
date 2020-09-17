function result(id) {
    if (confirm('Are you really want to delete this person?') == false) {
        document.getElementById('delete' + id).setAttribute("value", "no");

    }

}