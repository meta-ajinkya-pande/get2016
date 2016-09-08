$(document).ready(init);

function init(){
	$("#start").click(startAnimation);
	$("#stop").click(stopAnimation);
	$("#back").click(backAnimation);
	$("#left").click(startAnimation);
	$("#right").click(backAnimation);
	$("#top").click(topAnimation);
	$("#bottom").click(bottomAnimation);
}

function startAnimation() {
	$(".box").animate({left: '+=250px'},3000,'linear');
}

function stopAnimation() {
	$(".box").stop();
}

function backAnimation() {
	$(".box").animate({left: '-=250px'},3000,'linear');
}

function topAnimation() {
	$(".box").animate({top: '-=250px'},3000,'linear');
}

function bottomAnimation() {
	$(".box").animate({top: '+=250px'},3000,'linear');
}