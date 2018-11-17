// JavaScripts

//Data from input
var UFirstName = document.registration.FirstName;
var ULastName = document.registration.LastName;
var UAddress = document.registration.Address;  
var UCity = document.registration.City;  
var UPostalcode = document.registration.Postalcode;  
var UProvince = document.registration.Province;  
var Uage = document.registration.age; 
var UEmail = document.registration.Email;
var Upassword = document.registration.password;
var UConfirm = document.registration.confirm;

//validation
var FirstName_V = /^[a-zA-Z][a-zA-Z_\s,.-]+$/;
var LastName_V = /^[a-zA-Z][a-zA-Z_\s,.-]+$/;
var Address_V =/^[a-zA-Z0-9][a-zA-Z0-9_\s,.]+$/;
var City_V = /^[A-Za-z][a-zA-Z_\s,.]+$/;
//Postal codes do not include the letters D, F, I, O, Q or U, 
//and the first position also does not make use of the letters W or Z.
var Postalcode_V = /^[a-zA-Z][0-9][a-zA-Z][\s-]?[0-9][a-zA-Z][0-9]$/;
var Age_V = 18;
var Password_V =/((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{6,})/;
var Email_V = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

function formValidation()  
{   
    FirstName_validation();
    return false;   
}

//Guidelines for validating the user input

// Postalcode Code 
// The postal code has to be in the a0a0a0 format 
// (research it on the internet)
function Postalcode_validation()  
    {   
        if(UPostalcode.value.match(Postalcode_V))  
        {  
        Province_validation();
        return true;  
        }  
        else  
        {  
        alert('A Canadian postal code is a six-character string that forms part of a postal address in Canada. They are in the format A1A1A1');  
        UPostalcode.focus();  
        return false;  
        }  
    }  

// Province validation
// Province is one of NS, NF, PE, NB, QC, ON, MN, SK, AB, BC
function Province_validation()  
    {  
        if(UProvince.value == "Default")  
        {  
        alert('Select your province from the list');  
        UProvince.focus();
        return false;  
        }  
        else  
        {  
        Age_validation();  
        return true;  
        }  
    }  

// Age validation
// Age has to be at least 18 yrs. old.
function Age_validation()  
{  
    if(Uage.value >= Age_V)  
    {  
        Password_validation()
        return true;  
    }  
    else  
    {  
        alert('Age should be above 18');  
        Uage.focus();  
        return false;  
    }  
}  

//Email validation
//The Email field must contain the @ and . characters
function Email_validation()  
{  
    if(UEmail.value.match(Email_V))  
    {  
    alert('Thanks for registering with our website, your customer record was created successfully.');  
    window.location.reload();
    return true;  
    }  
    else  
    {  
    alert("You have entered an invalid email address!");  
    UEmail.focus();  
    return false;  
    }  
} 

// First Name validation
function FirstName_validation()  
    {   
        if(UFirstName.value.match(FirstName_V))  
        {  
        LastName_validation();
        return true;  
        }  
        else  
        {  
        alert('First name must have alphabet characters only');  
        UFirstName.focus();  
        return false;  
        }  
    } 

// Last Name validation
function LastName_validation()  
    {   
        if(ULastName.value.match(LastName_V))  
        {  
        Address_validation();
        return true;  
        }  
        else  
        {  
        alert('Last name must have alphabet characters only');  
        ULastName.focus();  
        return false;  
        }  
    } 

// Address validation
function Address_validation()  
    {   
        if(UAddress.value.match(Address_V))  
        {
        City_validation();
        return true;  
        }  
        else  
        {  
        alert('Address must have alphanumeric characters only');  
        UAddress.focus();  
        return false;  
        }  
    }  

function City_validation()  
    {   
        if(UCity.value.match(City_V))  
        { 
        Postalcode_validation();
        return true;  
        }  
        else  
        {  
        alert('City must have alphabet characters only');  
        UCity.focus();  
        return false;  
        }  
    } 

//Password validation
//Passwords must have at least 6 characters 
//and must contain at least one digit and one upper-case character

function Password_validation()  
    {  
        if(Upassword.value.match(Password_V))  
        {
            Confirm_validation();  
            return true;  

        }  
        else  
        { 
        alert('Passwords must have at least 6 characters and must contain at least one digit and one upper-case character');  
        Upassword.focus();
        return false; 
        }  
    }  

 //The Confirm Password and Password fields should have identical input.    
function Confirm_validation()  
    {  
        if(UConfirm.value.match(Upassword.value))  
        {  
            Email_validation();  
            return true;  
        }  
        else  
        { 
        alert('It is not the same password!');  
        UConfirm.focus();
        return false; 
        }  
    }  




