// import { setCookie } from "./cookie.js"

let singin_btn = document.getElementById("signin_btn");

let username_input = document.getElementById("username");
let username;
username_input.addEventListener("change", () => username = username_input.value);

let password_input = document.getElementById("password");
let password;
password_input.addEventListener("change", () => password = password_input.value);

singin_btn.onclick = function () {
    // preventDefault()
    console.log("로그인 페이지로 이동합니다")
    console.log("username: ", username);
    console.log("password", password);

    const token = "eyJpc0xvZ2luIjp0cnVlLCJ0eXBlIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.sLC9uaPTSFGzcoWSNe91b505maoXtnHzhPI3-WbuWnc";
    setCookie("loginToken", token);
    window.location.href = "todo.html";
};

let singup_btn = document.getElementById("signup_btn");
singup_btn.onclick = function () {
    console.log("회원가입 페이지로 이동합니다")
    window.location.href = "signup.html";
}

function setCookie(ckey, cvalue){
    const d = new Date();
    d.setTime(d.getTime+(60*60*1000));
    let expires ="expires="+d.toUTCString();
    document.cookie = ckey +"="+cvalue+";"+expires+";path=/";
}

