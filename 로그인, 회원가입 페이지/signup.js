let singup_btn = document.getElementById("singup_btn");

let username_input = document.getElementById("username");
let username;
username_input.addEventListener("change", () => username = username_input.value);

let male_input = document.getElementById("male");
male_input.addEventListener("click", () => gender = male_input.value);
let female_input = document.getElementById("female");
female_input.addEventListener("click", () => gender = female_input.value);
let gender;

let birth_input = document.getElementById("birth");
let birth;
birth_input.addEventListener("change", () => birth = birth_input.value);

let region_input = document.getElementById("region");
let region = region_input[0].value;
region_input.addEventListener("click", () => region = region_input.value);

let email_input = document.getElementById("email");
let email;
email_input.addEventListener("change", () => email = email_input.value);

let password1_input = document.getElementById("password1");
let password1;
password1_input.addEventListener("change", () => password1 = password1_input.value);

let password2_input = document.getElementById("password2");
let password2;
password2_input.addEventListener("change", () => password2 = password2_input.value);


singup_btn.onclick = function () {
    console.log("이름", username)
    console.log("성별", gender)
    console.log("생일", birth)
    console.log("고향", region)
    console.log("아이디(이메일)", email)
    console.log("비밀번호", password1)
};

let back_btn = document.getElementById("back_btn");

back_btn.onclick = function () {
    console.log("로그인 페이지로 이동합니다")
};