// Copyright 2006-2007 javascript-array.com

var timeout	= 500;
var closetimer	= 0;
var ddmenuitem	= 0;

// open hidden layer
function mopen(id)
{
    // cancel close timer
    mcancelclosetime();

    // close old layer
    if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';

    // get new layer and show it
    ddmenuitem = document.getElementById(id);
    ddmenuitem.style.visibility = 'visible';

}
// close showed layer
function mclose()
{
    if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';
}

// go close timer
function mclosetime()
{
    closetimer = window.setTimeout(mclose, timeout);
}

// cancel close timer
function mcancelclosetime()
{
    if(closetimer)
    {
        window.clearTimeout(closetimer);
        closetimer = null;
    }
}

// close layer when click-out
document.onclick = mclose; 
var monthtext=['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sept','Oct','Nov','Dec'];

function populatedropdown(){
    var today=new Date();
    var dayfield=document.getElementById("day");
    var monthfield=document.getElementById("month");
    var yearfield=document.getElementById("year");
    for(i = 1; i<31; i++){
        dayfield.options[i]=new Option(i, i+1);
    }
    dayfield.options[today.getDate()]=new Option(today.getDate(), today.getDate(), true, true); //select today's day
    for (var m=0; m<12; m++){
        monthfield.options[m]=new Option(monthtext[m], monthtext[m]);
    }
    monthfield.options[today.getMonth()]=new Option(monthtext[today.getMonth()], monthtext[today.getMonth()], true, true); //select today's month
    var thisyear=1950;
    for (var y=0; y<61; y++){
        yearfield.options[y]=new Option(thisyear, thisyear);
        thisyear+=1;
    }
    yearfield.options[0]=new Option(today.getFullYear(), today.getFullYear(), true, true); //select today's year
}
