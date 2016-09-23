var zgColorGoals = function () {
    var h4_list = document.getElementsByClassName('ww-breakWord');
    var color;
    for (var i = 0; i < h4_list.length; i++) {
        var h4Text = h4_list[i].innerHTML;
        if (h4Text.indexOf('[Processo de Trabalho]') >= 0) {
            color = '#B7D3FF';
            var divParent = h4_list[i].parentElement;
            divParent.style.backgroundColor = color;
        } else if (h4Text.indexOf('[Adventista]') >= 0) {
            color = '#DCEDC8';
            var divParent = h4_list[i].parentElement;
            divParent.style.backgroundColor = color;
        } else if (h4Text.indexOf('[Relatorios]') >= 0) {
            color = '#D7CCC8';
            var divParent = h4_list[i].parentElement;
            divParent.style.backgroundColor = color;
        }
    }
};

setTimeout(zgColorGoals, 1000);
setInterval(zgColorGoals, 5000);