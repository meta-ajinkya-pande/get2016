(function(){

function init(){
    var oriDomi = new OriDomi('.demo',{
		vPanels:         5,     // number of panels when folding left or right (vertically oriented)
		hPanels:         3,     // number of panels when folding top or bottom
		speed:           1200,  // folding duration in ms
		ripple:          2,     // backwards ripple effect when animating
		shadingIntesity: .5,    // lessen the shading effect
		perspective:     800,   // smaller values exaggerate 3D distortion
		maxAngle:        40,    // keep the user's folds within a range of -40 to 40 degrees
		shading:         'soft' // change the shading type
	});
//	var unfolded = true;
//	function effect() {
//    unfolded ? oriDomi.foldUp() : oriDomi.unfold();
//    unfolded = !unfolded;
//}
//effect();
//unfolded = false;
//effect();
//oriDomi.twist(90);
oriDomi.fracture(61);
//oriDomi.stairs(25);
	//oriDomi.collapse(40);
}

document.addEventListener('DOMContentLoaded', init, false);

})();