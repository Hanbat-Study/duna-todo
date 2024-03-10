let singin_btn = document.getElementById("singin_btn");

let username_input = document.getElementById("username");
let username;
username_input.addEventListener("change", () => username = username_input.value);

let password_input = document.getElementById("password");
let password;
password_input.addEventListener("change", () => password = password_input.value);

singin_btn.onclick = function () {

    console.log("로그인 페이지로 이동합니다")
    console.log("username: ", username);
    console.log("password", password);
};

let singup_btn = document.getElementById("singup_btn");
singup_btn.onclick = function () {
    console.log("회원가입 페이지로 이동합니다")
}