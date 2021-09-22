var $box = $("#rotationbox"),  //获取rotationbox
	$picLi = $("#rotationbox .pic li"), //获取轮播图的图片
	$tabLi = $("#rotationbox .tab li"), 
	len = $tabLi.length,       //有多少个轮播图片和图片下面的点
	timer;                     //暂时不明白
// $box.height($picLi.height());  //box的高度
first = 0;                     //初始first = 0

//初始化设置
$picLi.hide().eq(0).show(); //隐藏$picLi 然后显示第一个
$tabLi.eq(0).addClass("on");

//tab区域
$tabLi.click(function() {
	var x = $(this).index(); //tabLi[i].index = i;获取点击的这个的索引值
	if (x != first) {
		change(x);
	}
});

auto();                     //auto函数

$box.hover(function() {    //hover是鼠标经过的时候
	clearInterval(timer);  //clearInterval() 方法可取消由 setInterval() 设置的 timeout clearInterval() 方法的参数必须是由 setInterval() 返回的 ID 值。
}, auto);

//实现点击图片到具体页面
$picLi.click(function() {
	var x = $(this).index(); //picLi[i].index = i;
	var boxes = document.querySelectorAll(".box1");  //上方导航栏的名字
	var navs = document.querySelectorAll('#nav');
	console.log(boxes);
	console.log(x);
	boxes[0].className = "box1";
	boxes[x].className = "box1 current";
	navs[0].className = "hide interval";
	navs[x].className = "navchecked interval";
});

function auto() {                     //自动变化
	timer = setInterval(function() {
		var x = first;
		x++;
		x %= len;
		change(x);
	}, 3000)
}


//变化函数
function change(i) {
	$picLi.eq(first).fadeOut(2000);      //点击前的fadeOut用淡出效果来隐藏
	$tabLi.eq(first).removeClass("on");  //class="tab-item on 表示下面小点的颜色变化"
	first = i;                           //更新first的值
	$picLi.eq(first).fadeIn(2000);        //获得当前的元素用深化效果加强
	$tabLi.eq(first).addClass("on");
	
}

