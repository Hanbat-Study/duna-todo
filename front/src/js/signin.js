// import { setCookie } from "./cookie.js"

let singin_btn = document.getElementById("signin_btn");

let id_input = document.getElementById("id");
let id;
id_input.addEventListener("change", function () {
    id = id_input.value;
    emailValid(id);
    disabled_btn();
});

let password_input = document.getElementById("password");
let password;
password_input.addEventListener("change", function () {
    password = password_input.value
    passwordValid(password);
    disabled_btn();
});

singin_btn.onclick = function () {
    console.log("로그인 페이지로 이동합니다")

    const user = localStorage.getItem("user");
    
    if(user!=null){
        const parseUser = JSON.parse(user)
        if(id == parseUser.loginId && password == parseUser.password){
            const token = "eyJpc0xvZ2luIjp0cnVlLCJ0eXBlIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.sLC9uaPTSFGzcoWSNe91b505maoXtnHzhPI3-WbuWnc";
            setCookie("loginToken", token);
        }
    }
};

let singup_btn = document.getElementById("signup_btn");
singup_btn.onclick = function () {
    console.log("회원가입 페이지로 이동합니다")
    window.location.href = "signup.html";
}

function setCookie(ckey, cvalue) {
    const d = new Date();
    d.setTime(d.getTime + (60 * 60 * 1000));
    let expires = "expires=" + d.toUTCString();
    document.cookie = ckey + "=" + cvalue + ";" + expires + ";path=/";
}


const reEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;

const resPass = /^[A-Za-z0-9]{8,20}$/;

const res = /^[A-Za-z0-9]{1,20}$/;

let ppsw = document.getElementById("ppsw");
let pid = document.getElementById("pid");

let fpsw = false;
let fid = false;

function emailValid(id) {
    if (!reEmail.exec(id)) {
        pid.innerHTML = "@”, “.” 포함";
        fid = false;
    } else {
        pid.innerHTML = "만족";
        fid = true;
    }
    console.log(fid);
}

function passwordValid(password) {
    if (!resPass.exec(password)) {
        ppsw.innerHTML = "8자 이상";
        fpsw = false;
    } else {
        ppsw.innerHTML = "만족";
        fpsw = true;
    }
    console.log(fpsw);
}


singin_btn.disabled = true;


function disabled_btn() {
    if (fpsw && fid) {
        singin_btn.disabled = false;
    }
    else {
        singin_btn.disabled = true;
    }
}