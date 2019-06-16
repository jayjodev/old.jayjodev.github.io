//JavaScript

function Maketable()
{

    var Rows = document.getElementById('rows').value;
    var Columns = document.getElementById('cols').value;
    var StartT = '<table border="2">\n';
    var Contents = '';
    
        if (Rows.length == 0) 
        {
        alert('Input the number of Rows!');
        return false;
        }
        if (Columns.length == 0) 
        {
        alert('Input the number of Columns!');
        return false;
        }

    for (var x = 1; x <= Rows; x++)
    {
        Contents += '<tr>';

        for (var i = 1; i <= Columns; i++)
        {
            Contents += '<td>';
            Contents += 'T'+'(' + x + ',' + i+')';
            Contents += '</td>';
        }
        Contents += '</tr>\n';
    }
    var EndT = '</table>';

    document.getElementById('InputfromJava').innerHTML = StartT + Contents + EndT;
}


