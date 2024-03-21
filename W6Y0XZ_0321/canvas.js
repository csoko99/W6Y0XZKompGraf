
function init()
{
    const tabla = document.getElementById('LLCnavas');
    const ctx = tabla.getContext("2d");
    
//felirat
    ctx.font = "40px Arial";
    ctx.fillStyle = "orange";
    ctx.textAlign = "center";
    ctx.fillText("Programtervező informatikus 2024", tabla.width/2, 50);

//körszerű alakzat
    ctx.beginPath();
    ctx.arc(500, 150, 50, 7, 11);
    ctx.closePath(60);
    ctx.lineWidth = 2;
    ctx.fillStyle = 'yellow';
    ctx.fill();
    ctx.stroke();

//négyzet
   
    ctx.beginPath();
    ctx.rect(50, 200, 250, 120);
    ctx.strokeStyle = "blue";
    ctx.stroke();

//gradián
    const grd = ctx.createRadialGradient(180,120,10,190,100,120);
    grd.addColorStop(0,"orange");
    grd.addColorStop(0.25,"red");
    grd.addColorStop(0.5,"blue");
    grd.addColorStop(1,"#39ff14");
    ctx.fillStyle = grd;
    ctx.fillRect(60,70,200,100);

//kép
    const img = new Image();

    img.src = 'the.jpeg';
    img.onload = function()
    {
        const x = 550;
        const y = 250;
        ctx.drawImage(img, x, y, 150, 100);
    };
}
