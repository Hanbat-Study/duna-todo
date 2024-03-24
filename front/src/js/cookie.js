function setCookie(ckey, cvalue){
    const d = new Date();
    d.setTime(d.getTime+(60*60*1000));
    let expires ="expires="+d.toUTCString();
    document.cookie = ckey +"="+cvalue+";"+expires+";path=/";
}

function getCookie(ckey){
    let key = ckey+"=";
    let ca = document.cookie.split(';');
    for(let i =0;i<ca.length;i++){
        let c =ca[i];
        while(c.charAt(0)==' '){
            c=c.substring(1);
        }
        if(c.indexOf(key)==0){
            return c.substring(key.length, c.length);
        }
        return "";
    }
}

function checkCookie(){
    let token = getCookie("loginToken");
    if(token ==""){
        // let html=`<p>${token}</p>`
        // document.getElementById("loginToken").innerHTML=html;
        window.location.href="signin.html";
    }
}

// export { setCookie }