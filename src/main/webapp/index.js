var getUserMethod = "get";

$(document).ready(function() {
	//getBanner();
});

//获取信息
function getUser() {
	$.ajax( {
		type : 'POST',
		url : "/user/getUser/1",
		success : function(json) {
			alert(json);
		}
	});
}

//获取信息
function getBanner() {
	$.ajax( {
		type : 'POST',
		url : "/index/getBanner",
		dataType : "json",
		success : function(json) {
			console.info(json);
			for (var i = 0; i < json.length; i++) {
				alert(json[i].name);
				$("#search").val(json[i].name);
			}
		}
	});
}

function showWx() {
	//$("#weixinqrcode").attr("display","");
	$("#weixinqrcode").removeClass("display");
}
