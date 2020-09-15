function result() {
    if (confirm('Are you really want to delete this person?') == false) {
        document.getElementById('delete').setAttribute("value", "no");
    }
}