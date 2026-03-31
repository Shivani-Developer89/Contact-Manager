console.log("Script loaded");

let currentTheme = getTheme();
changeTheme();

//TODO
function changeTheme() {
    // set to web page
    changePageTheme(currentTheme, currentTheme);

    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
    changeThemeButton.querySelector("span").textContent =
        currentTheme == "light" ? "dark" : "light";


    changeThemeButton.addEventListener("click", (Event) => {
        const oldTheme = currentTheme;
        console.log("change theme button clicked");
        if (currentTheme === "dark") {
            //theme to light
            currentTheme = "light";
        } else {
            //theme to  dark
            currentTheme = "dark";
        }

        changePageTheme(currentTheme, oldTheme);
    });


}
//set theme to localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme)
}

// get theme from lacalStorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}

function changePageTheme(theme, oldTheme) {
    //set theme to localStorage
    setTheme(currentTheme);
    //remove the current Theme
    document.querySelector("html").classList.remove(oldTheme);

    //set the current theme
    document.querySelector("html").classList.add(currentTheme);


    document.querySelector('#theme_change_button').querySelector("span").textContent =
        theme == "light" ? "dark" : "light";
}