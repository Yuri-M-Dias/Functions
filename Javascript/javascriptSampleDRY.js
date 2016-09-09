var goalsConfig = {
   '[Processo de Trabalho]': '#B7D3FF',
   '[Mecanismo de Regras]' : '#B2DFDB',
   '[Relatorios]'          : '#D7CCC8',
   '[Adventista]'          : '#DCEDC8',
   '[bug]'                 : '#FFCCBC'
};

var zgColorGoals = function () {
   var $h4CardsList = $('.ww-breakWord');
   $h4CardsList.each(
         function (index, h4Element) {
            colorOneCard(h4Element);
         }
   );
};

var colorOneCard = function (h4Element) {
   var cardDiv = $(h4Element).parent();
   var cardText = h4Element.innerHTML;
   var backgroundColor = findGoalColor(cardText) || '#FFF';
   cardDiv.css('background-color', backgroundColor);
   $(h4Element).css('background-color', backgroundColor);
};

var findGoalColor = function (cardText) {
   var textLowerCase = cardText.toLowerCase();
   var color = '';
   $.each(goalsConfig, function (goalName, goalColor) {
            var goalNameLowerCase = goalName.toLowerCase();
            if (textLowerCase.indexOf(goalNameLowerCase) != -1) {
               color = goalColor;
            }
         }
   );
   return color;
};

setTimeout(zgColorGoals, 1000);
setInterval(zgColorGoals, 5000);
