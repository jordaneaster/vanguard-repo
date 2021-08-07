function renderUserLogin() {
  app.innerHTML = LoginPage();
  app.addEventListener("click", (event) => {
    const header = document.querySelector(".header");
    header.removeAttribute("class", "header");
    if (event.target.classList.contains("create_user")) {
      const userName =
        event.target.parentElement.querySelector(".userName").value;
      const password =
        event.target.parentElement.querySelector(".password").value;
      const age = event.target.parentElement.querySelector(".age").value;
      apiActions.postRequest(
        "http://localhost:8080/create_user_profile",
        {
          userName: userName,
          password: password,
          age: age,
        },

        (users) => (app.innerHTML = HomePage(users))
      );
    }
  });
}
