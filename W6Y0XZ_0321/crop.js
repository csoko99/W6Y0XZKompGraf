function init()
{
    const tabla = document.getElementById('LLCnavas');
    const ctx = tabla.getContext("2d");

    var img = new Image();
    img.src = "the.jpeg";

    img.onload = function()
    {
        ctx.drawImage(img, 170, 50, 200, 200, 500 , 150, 200, 200);
    }
}