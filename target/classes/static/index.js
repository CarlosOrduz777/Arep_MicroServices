
function loadGetMsg() {
	const xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
		document.getElementById("getrespmsg").innerHTML =
		this.responseText;
	}
	xhttp.open("GET", "/stream");
	xhttp.send();
}

