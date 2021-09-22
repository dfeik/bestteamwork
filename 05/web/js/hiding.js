var lis = document.querySelectorAll('#approachgou');
var smallnavs = document.querySelectorAll('#smallnav');


for (var i = 0; i < lis.length; i++) {
    lis[i].setAttribute('index', i);
    lis[i].addEventListener('click', function() {
        for (var i = 0; i < lis.length; i++) {
            lis[i].className = ' ';
        }
        this.className = 'nav1';
    })
    lis[i].addEventListener('click', function() {
        for (var i = 0; i < lis.length; i++) {
            smallnavs[i].className = 'hide';
        }
        var index = this.getAttribute('index');
        smallnavs[index].className = 'navchecked';
    })
}