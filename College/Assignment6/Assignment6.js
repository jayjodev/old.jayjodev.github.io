//JavaScript

$(document).ready(function () {

    var imageUrl = 'Basic';
   
    $('#Front').on({

        mouseover: function () {
            $(this).css({
                'cursor': 'pointer',
                'border-Color': 'blue'
            });
        },
        mouseout: function () {
            $(this).css({
                'cursor': 'default',
                'border-Color': 'grey'
            });
        },
        click : function () {

            if (imageUrl == 'images/Daegu1.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu5.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu5.PNG'
                return imageUrl
            }
            
                if (imageUrl == 'images/Daegu2.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu1.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu1.PNG'
                return imageUrl
            }
                if (imageUrl == 'images/Daegu3.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu2.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu2.PNG'
                return imageUrl
            }
            if (imageUrl == 'images/Daegu4.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu3.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu3.PNG'
                return imageUrl
            }
            if (imageUrl == 'images/Daegu5.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu4.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu4.PNG'
                return imageUrl
            }
            if (imageUrl == 'Basic')
            {
                $('#mainImage').attr('src', 'images/Daegu5.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu5.PNG'
                return imageUrl
            }

        }
    });

    $('#back').on({

        mouseover: function () {
            $(this).css({
                'cursor': 'pointer',
                'border-Color': 'blue'
            });
        },
        mouseout: function () {
            $(this).css({
                'cursor': 'default',
                'border-Color': 'grey'
            });
        },
        click : function () {

            if (imageUrl == 'images/Daegu1.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu2.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("slow");
                imageUrl = 'images/Daegu2.PNG'
                return imageUrl
            }
            
                if (imageUrl == 'images/Daegu2.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu3.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("slow");
                imageUrl = 'images/Daegu3.PNG'
                return imageUrl
            }
                if (imageUrl == 'images/Daegu3.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu4.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("slow");
                imageUrl = 'images/Daegu4.PNG'
                return imageUrl
            }
            if (imageUrl == 'images/Daegu4.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu5.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("slow");
                imageUrl = 'images/Daegu5.PNG'
                return imageUrl
            }
            if (imageUrl == 'images/Daegu5.PNG')
            {
                $('#mainImage').attr('src', 'images/Daegu1.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("slow");
                imageUrl = 'images/Daegu1.PNG'
                return imageUrl
            }            
            if (imageUrl == 'Basic')
            {
                $('#mainImage').attr('src', 'images/Daegu5.PNG');
                $("#mainImage").fadeOut("fast");
                $("#mainImage").fadeIn("fast");
                imageUrl = 'images/Daegu5.PNG'
                return imageUrl
            }

        }
    });

    $('#divContainer img').on({
        mouseover: function () {
            $(this).css({
                'cursor': 'pointer',
                'border-Color': 'red'
            });
        },
        mouseout: function () {
            $(this).css({
                'cursor': 'default',
                'border-Color': 'grey'
            });
        },
        click : function () {
            imageUrl = $(this).attr('src');
            $('#mainImage').attr('src', imageUrl);
            $("#mainImage").fadeOut("fast");
            $("#mainImage").fadeIn("slow");
            return imageUrl
        }
        
    });


});


