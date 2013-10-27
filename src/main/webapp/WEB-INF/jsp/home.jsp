<!doctype html>
<html>
	<head>
		<title>Maps</title>
		<style type="text/css">
			#map {height:500px}
		</style>
		<script type="text/javascript" 
		src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
		<script type="text/javascript">
			function init(){
				var myOptions={
						center: new google.maps.LatLng(-34.397,150.644),
						zoom:8,
						mapTypeId:google.maps.MapTypeId.ROADMAP
				};
				var map= new google.maps.Map(document.getElementById("map"),myOptions);
			}
		</script>
	</head>
	<body onload="init()">
		<div id="map"></div>
	</body>
</hs istml>