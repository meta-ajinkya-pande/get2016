$(document).ready(toggleButton);
			
function toggleButton(){
	$('#togglebutton').click(toggleButtonText);
}

function toggleButtonText(){
	var toggleValue = $('#togglebutton').html();
	if(toggleValue === "hide"){
		$('#togglebutton').html('show');
		$('#toggle').hide(800);
	}else{
		$('#togglebutton').html('hide');
		$('#toggle').show(900);
	}
}