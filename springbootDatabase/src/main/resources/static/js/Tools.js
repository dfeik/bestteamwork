//string 转 JSON
// function change(str) {
// 	var reg = new RegExp("=","g");
// 	// str = str.replace(reg,":");
// 	var str1 = "";
// 	for (var i = 0; i < str.length; i++) {
// 		if (str[i] == ":" || str[i] == ",") {
// 			str1 = str1 + "'" + str[i] + "'";
// 			if(str[i] == ","){
// 				i+=1;
// 			}
// 		} else {
// 			if (str[i] == "{" || str[i] == "}") {
// 				if (str[i] == "{") {
// 					str1 = str1 + str[i] + "'";
// 				} else {
// 					str1 = str1 + "'" + str[i];
// 					break;
// 				}
// 			} else {
// 				if(str[i] == ""){
// 					continue;
// 				}else{
// 					str1 = str1 + str[i];
// 				}
// 			}
// 		}
// 		// console.log("str=" + str[i] + "    str1=" + str1);
// 	}
// 	// console.log(encodeURIComponent(str1));	//查看编码序列
// 	// return JSON.parse(str1);
// 	str1 = eval("(" + str1 + ")"); 	//转换JSON对象
// 	// alert(typeof str1);
// 	// alert("pet_name="+str1.pet_name)
// 	return str1;
// }

//封装Cookie
function setCookie(json,time){
	var date = new Date(new Date().getTime() + time*24*60*60*1000);
	for(var key in json){
		document.cookie = key + "=" +json[key]+"; expires=" + date;
	}
}


//查找cookie中的特定值
function getCookie(attr){
	return document.cookie.match( new RegExp("(^|\\s)" + attr + "=([^;]+)(;|$)"))[2];
}

//清除cookie
function removeCookie(attr){
	var json = {};
	json[attr] = "";
	setCookie(json,-1);
}

//string转换arrString
function transitionArrString(data) {
	    data = data.replace("[","");
	    data = data.replace("]","");
		var arrData = new Array();
		var count = 0;
		for (var i = 0; i < data.length; i++) {
			if (data[i] == "}") {
				arrData[count] = arrData[count] + data[i];
				count++;
			} else {
				if ((data[i] == "," && data[i + 1] == "{") || data[i] == "") {
					continue;
				} else {
					if (data[i] == "{") {
						arrData[count] = "";
					}
					arrData[count] = arrData[count] + data[i];
				}
			}
		}
		// arrData.pop();
		return arrData;
}

//数组转json数组
function arrToJson(data) {

	  data.forEach(function (temp) {
		    change(temp);
	  })
}
