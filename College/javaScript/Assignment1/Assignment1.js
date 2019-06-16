//JavaScript

function myFunction() {

    if (document.BMR.mySelect.value == "Metric")
    {
    document.getElementById("POUNDS").innerHTML = "KG";
    document.getElementById("INCHES").innerHTML = "CM";
    }
    else
    {
    document.getElementById("POUNDS").innerHTML = "POUNDS";
    document.getElementById("INCHES").innerHTML = "INCHES";
    }
}



// Metric
    
function ClickButton() {


    if (document.BMR.Weight.value.length == 0) {
        alert('Weight field is empty!');
        return false;
    }

    if (document.BMR.Height.value.length == 0) {
        alert('Height field is empty!');
        return false;
    }
    if (document.BMR.Age.value.length == 0) {
        alert('Age field is empty!');
        return false;
    }


    if (document.BMR.mySelect.value == "Metric") {
        NumberStyle = Math.pow(10, 2);

        if (document.getElementById("Woman").selected) 
        {
            document.BMR.BMRResult.value = 655.1 + (9.563 * (document.BMR.Weight.value)) + (1.850 * (document.BMR.Height.value)) - (4.676 * (document.BMR.Age.value));

        
            if (document.getElementById("No").selected)
            {
                document.BMR.Result.value = 1.53 * (655.1 + (9.563 * (document.BMR.Weight.value)) + (1.850 * (document.BMR.Height.value)) - (4.676 * (document.BMR.Age.value)));

            }

            if (document.getElementById("Moderate").selected)
            {
                document.BMR.Result.value = 1.76 * (655.1 + (9.563 * (document.BMR.Weight.value)) + (1.850 * (document.BMR.Height.value)) - (4.676 * (document.BMR.Age.value)));

            }
            if (document.getElementById("Hard").selected)
            {
                document.BMR.Result.value = 2.25 * (655.1 + (9.563 * (document.BMR.Weight.value)) + (1.850 * (document.BMR.Height.value)) - (4.676 * (document.BMR.Age.value)));

            }
        }

        if (document.getElementById("Man").selected)
        {
            document.BMR.BMRResult.value = 66.5 + (13.75 * (document.BMR.Weight.value)) + (5.003 * (document.BMR.Height.value)) - (6.755 * (document.BMR.Age.value));



            if (document.getElementById("No").selected) {

                document.BMR.Result.value = 1.53 * (66.5 + (13.75 * (document.BMR.Weight.value)) + (5.003 * (document.BMR.Height.value)) - (6.755 * (document.BMR.Age.value)));
            }


            if (document.getElementById("Moderate").selected) {

                document.BMR.Result.value = 1.76 *(66.5 + (13.75 * (document.BMR.Weight.value)) + (5.003 * (document.BMR.Height.value)) - (6.755 * (document.BMR.Age.value)));
            }

            if (document.getElementById("Hard").selected) {

                document.BMR.Result.value = 2.25 * (66.5 + (13.75 * (document.BMR.Weight.value)) + (5.003 * (document.BMR.Height.value)) - (6.755 * (document.BMR.Age.value)));
            }
        }

        document.BMR.BMRResult.value = Math.round(document.BMR.BMRResult.value * NumberStyle) / NumberStyle;
        document.BMR.Result.value = Math.round(document.BMR.Result.value * NumberStyle) / NumberStyle;
    }

//Imperial
    else {

        NumberStyle = Math.pow(10, 2);

        if (document.getElementById("Woman").selected) {

            document.BMR.BMRResult.value = 655.1 + (4.35 * (document.BMR.Weight.value)) + (4.7 * (document.BMR.Height.value)) - (4.7 * (document.BMR.Age.value));


            if (document.getElementById("No").selected) {

                document.BMR.Result.value = 1.53 * (655.1 + (4.35 * (document.BMR.Weight.value)) + (4.7 * (document.BMR.Height.value)) - (4.7 * (document.BMR.Age.value)));
            }

            if (document.getElementById("Moderate").selected) {

                document.BMR.Result.value = 1.76 * (655.1 + (4.35 * (document.BMR.Weight.value)) + (4.7 * (document.BMR.Height.value)) - (4.7 * (document.BMR.Age.value)));
            }
            if (document.getElementById("Hard").selected) {

                document.BMR.Result.value = 2.25 * (655.1 + (4.35 * (document.BMR.Weight.value)) + (4.7 * (document.BMR.Height.value)) - (4.7 * (document.BMR.Age.value)));
            }

        }

        if (document.getElementById("Man").selected)
        {

            document.BMR.BMRResult.value = 66 + (6.2 * (document.BMR.Weight.value)) + (12.7 * (document.BMR.Height.value)) - (6.76 * (document.BMR.Age.value));


            if (document.getElementById("No").selected)
            {
                document.BMR.Result.value = 1.53 * (66 + (6.2 * (document.BMR.Weight.value)) + (12.7 * (document.BMR.Height.value)) - (6.76 * (document.BMR.Age.value)));
            }

            if (document.getElementById("Moderate").selected) {
                document.BMR.Result.value = 1.76 * (66 + (6.2 * (document.BMR.Weight.value)) + (12.7 * (document.BMR.Height.value)) - (6.76 * (document.BMR.Age.value)));
            }

            if (document.getElementById("Hard").selected) {
                document.BMR.Result.value = 2.25 * (66 + (6.2 * (document.BMR.Weight.value)) + (12.7 * (document.BMR.Height.value)) - (6.76 * (document.BMR.Age.value)));
            }

        }
        document.BMR.BMRResult.value = Math.round(document.BMR.BMRResult.value * NumberStyle) / NumberStyle;
        document.BMR.Result.value = Math.round(document.BMR.Result.value * NumberStyle) / NumberStyle;
    }
}

