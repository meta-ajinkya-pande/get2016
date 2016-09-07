function displaybtn(){
	var div = document.getElementById('togglebutton');
	div.innerHTML === 'show' ? 'hide' : 'show';

	var div = document.getElementById('toggle');
	div.style.display = div.style.display == 'none' ? 'inline' : 'none';
}