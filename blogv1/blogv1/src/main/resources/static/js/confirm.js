function result() {
    if (confirm('Ты действительно этого хочешь?')) {
        document.getElementById('promt').setAttribute("value", "yes");
    }
}