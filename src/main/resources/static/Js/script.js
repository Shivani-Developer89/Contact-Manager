console.log("Script loaded");

let currentTheme = getTheme();
changeTheme();

//TODO
function changeTheme() {
    document.querySelector("html").classList.add(currentTheme)

}

//set theme to localStorage
function setTheme(theme) {
    localStorage.setItem("theme ", theme)
}

// get theme from lacalStorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}