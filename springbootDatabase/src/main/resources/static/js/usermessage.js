$(function(){
	//鼠标移动到a标签上变色
	var color;
	var userid_pass = false;
	var userphone_pass = false;
	$("a").mouseover(function(){
		color = $(this).css("color");
		$(this).css({
			color:"red",
		}
		);
	}).mouseout(function(){
		$(this).css({
			color:color,
		});
	});
	

	var oUsername = $("#Login_username");
	var oPhone = $("#Login_phone");
	//提示信息
	var oUsername_tip = $("#tip_name");
    var oPhone_tip = $("#tip_phone")
	//清除信息
	oUsername.prop("value","");
	oPhone.prop("value","");
	//验证帐号
	oUsername.focus(function(){
		oUsername_tip.text("昵称").css({display:"block",color:"grey"});
	}).blur(function(){
		if($(this).val() == ""){
			oUsername_tip.text("帐号不能为空").css({display:"block",color:"red"});
		}else{
			userid_pass  = true;
			oUsername_tip.css({display:"none"});
		}
	});

    oPhone.focus(function(){
		oPhone_tip.text("手机号码").css({display:"block",color:"grey"});
	}).blur(function(){
		if($(this).val() == ""){
			oPhone_tip.text("帐号不能为空").css({display:"block",color:"red"});
		}else{
			userphone_pass= true;
			oPhone_tip.css({display:"none"});
		}
	});

	$("#Login_action #Login_submit input").click(function () {
		if(userid_pass && userphone_pass){
			// alert(oUsername.val()+oPassword.val());
			$.ajax({
				url: "/jsonbuyer",
				async:false,
				type:"post",
				dataType:"json",
                data:{
                    "b_id":oUsername.val(),
                    "b_phone":oPhone.val()
                   },
				success:function (data) {
				    alert("成功预定")
				},
				error:function (data) {
					alert("失败="+data.status);
				}
			});
		}else{
			if(username_pass == false){
				oUsername_tip.text("请完善帐号信息").css({display:"block",color:"red"});
			}
			if(password_pass == false){
				oPassword_tip.text("请完善电话号码信息").css({display:"block",color:"red"});
			}
			return false;
		}
	});
});