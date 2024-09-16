
function validateForm()
{
    var x=document.forms["myform"]["uname"].value;  
    if(x==null || x=="" )
    {
        alert("name can't be left blank");
        return false;
    }

    var y=document.forms["myform"]["pass"].value;
    if(y==null || y=="")
    {
        alert("last name is mandatory");
        return false;
    }
    else
    {
        return true;
    }

}