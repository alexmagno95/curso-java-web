function alteraFontClass(){
	$("font").attr("class", "linksVermelhos");
}

$("button").on("click", function(event){
	alteraFontClass();
});