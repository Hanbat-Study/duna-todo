let singup_btn = document.getElementById("singup_btn");

let username_input = document.getElementById("username");
let username;
username_input.addEventListener("change",
    function () {
        username = username_input.value;
        usernameValid(username);
        disabled_btn();
    });

let male_input = document.getElementById("male");
male_input.addEventListener("click", () => gender = male_input.value);
let female_input = document.getElementById("female");
female_input.addEventListener("click", () => gender = female_input.value);
let gender;

let birth_input = document.getElementById("birth");
let birth;
birth_input.addEventListener("change", () => birth = birth_input.value);

let hometown_input = document.getElementById("hometown");
let hometown = hometown_input[0].value;
hometown_input.addEventListener("click", () => hometown = hometown_input.value);

let id_input = document.getElementById("id");
let id;
id_input.addEventListener("change",
    function () {
        id = id_input.value;
        emailValid(id);
        disabled_btn();
    });

let password1_input = document.getElementById("password1");
let password1;
password1_input.addEventListener("change",
    function () {
        password1 = password1_input.value
        passwordValid(password1);
        disabled_btn();
    });

let password2_input = document.getElementById("password2");
let password2;
password2_input.addEventListener("change", () => password2 = password2_input.value);


singup_btn.onclick = function () {

    const user = {
        "name": username,
        "gender": gender,
        "birth": birth,
        "hometown": hometown,
        "loginId": id,
        "password": password1
    };
    const jsonString = JSON.stringify(user);

    localStorage.setItem("user", jsonString);

    window.location.href = "signin.html";
};

let back_btn = document.getElementById("back_btn");

back_btn.onclick = function () {
    console.log("로그인 페이지로 이동합니다")
    window.location.href = "signin.html";
};


const reEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;

const resPass = /^[A-Za-z0-9]{8,20}$/;

const res = /^[ㄱ-ㅎ가-힣A-Za-z0-9]{1,20}$/;

let ppsw = document.getElementById("ppsw");
let pid = document.getElementById("pid");
let pnmae = document.getElementById("pname");

let fpsw = false;
let fid = false;
let fname = false;

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

function usernameValid(username) {
    if (!res.exec(username)) {
        pnmae.innerHTML = "입력하세요.";
        fname = false;
    } else {
        pnmae.innerHTML = "만족";
        fname = true;
    }
    console.log(fname);
}



singup_btn.disabled = true;


function disabled_btn() {
    if (fpsw && fid && fname) {
        singup_btn.disabled = false;
    }
    else {
        singup_btn.disabled = true;
    }
}