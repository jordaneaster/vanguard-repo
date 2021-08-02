import apiActions from "./api-actions/api-actions";
import Footer from "./components/Footer";
import Header from "./components/Header";
import HomePage from "./pages/HomePage";
import user_login from "./pages/LoginPage";
import userWelcome from "./pages/UserProfilePage";
import MoodsPage from "./pages/MoodsPage";
import TriggersPage from "./pages/TriggersPage";
import CopingMechanismsPage from "./pages/CopingMechanismsPage";
import ConsequencesPage from "./pages/ConsequencesPage";
import ResultsPage from "./pages/ResultsPage";
import ResponsesPage from "./pages/ResponsesPage";
import AlternativesPage from "./pages/AlternativesPage";
import ReviewsPage from "./pages/ReviewsPage";
import AboutUsPage from "./pages/AboutUsPage";
import LegalPage from "./pages/LegalPage";
import LoginDraft from "./pages/LoginDraft";
import ContactUsPage from "./pages/ContactUsPage";



const app = document.querySelector("#app");

buildPage();

function buildPage() {
  header();
  footer();
  renderUserLogin();
  home();
  moods();
  triggers();
  copingMechanisms();
  consequences();
  results();
  alternatives();
  responses();
  reviews();
  about();
  contact();
  legal();
  loginDraft();

}

function header() {
  const headerElement = document.querySelector(".header");
  headerElement.innerHTML = Header();
}
function footer() {
  const footerElement = document.querySelector(".footer");
  footerElement.innerHTML = Footer();
}

function renderUserLogin() {
  app.innerHTML = LoginPage();
  app.addEventListener("click", (event) => {
    console.log("firing");
    if (event.target.classList.contains("create_user")) {
      const userName =
        event.target.parentElement.querySelector(".userName").value;
      const password =
        event.target.parentElement.querySelector(".password").value;
      const age = event.target.parentElement.querySelector(".age").value;
      const mood = event.target.parentElement.querySelector(".intake").value;
      console.log(mood);
      console.log(event.target);
      apiActions.postRequest(
        "http://localhost:8080/create_user_profile",
        {
          userName: userName,
          password: password,
          age: age,
          mood: mood,
        },
        (users) => (app.innerHTML = userWelcome(users))
      );
      apiActions.getRequest("http://localhost:8080:/users", (user) => {
        app.innerHTML = userInfo(user);
      });
    }
  });
}

function navUserProfile() {
  const profilePage = document.querySelector(".nav_list_profile");
  profilePage.addEventListener("click", () => {
    const app = document.querySelector("#app");
    apiActions.getRequest("http://localhost:8080/users", (user) => {
      app.innerHTML = userWelcome(user);
    });
    renderUser();
  });
}

function renderUser() {
  app.innerHTML = userWelcome();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains(".userName")) {
      const userId = event.target.parentElement.querySelector("#userId").value;
      apiActions.getRequest(userId, (user) => {
        app.innerHTML = userInfo(user);
      });
    }
  });
}
function loginDraft() {
  const homeElement = document.querySelector(".nav__list_loginDraft");
  homeElement.addEventListener("click", () => {
    app.innerHTML = LoginDraft();
  });
}


function moods() {
  const moodElement = document.querySelector(".nav__list_moods");
  moodElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest("http://localhost:8080/moods", (moods) => {
      console.log(moods);
      app.innerHTML = MoodsPage(moods);
    });
  });
}

function triggers() {
  const triggerElement = document.querySelector(".nav__list_triggers");
  triggerElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest("http://localhost:8080/triggers", (triggers) => {
      console.log(triggers);
      app.innerHTML = TriggersPage(triggers);
    });
  });
}

function copingMechanisms() {
  const copingElement = document.querySelector(".nav__list_coping_mechanisms");
  copingElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest(
      "http://localhost:8080/coping",
      (copingMechanisms) => {
        console.log(copingMechanisms);
        app.innerHTML = CopingMechanismsPage(copingMechanisms);
      }
    );
  });
}

function consequences() {
  const consequencesElement = document.querySelector(".nav__list_consequences");
  consequencesElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest(
      "http://localhost:8080/consequences",
      (consequences) => {
        console.log(consequences);
        app.innerHTML = ConsequencesPage(consequences);
      }
    );
  });
}

function results() {
  const resultsElement = document.querySelector(".nav__list_results");
  resultsElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest("http://localhost:8080/results", (results) => {
      console.log(results);
      app.innerHTML = ResultsPage(results);
    });
  });
}

function alternatives() {
  const alternativesElement = document.querySelector(".nav__list_alternatives");
  alternativesElement.addEventListener("click", () => {
    apiActions.getRequest(
      "http://localhost:8080/alternatives",
      (alternatives) => {
        console.log(alternatives);
        app.innerHTML = AlternativesPage(alternatives);
      }
    );
  });
}

function responses() {
  const responseElement = document.querySelector(".nav__list_responses");
  responseElement.addEventListener("click", () => {
    console.log("firing!");
    apiActions.getRequest("http://localhost:8080/responses", (responses) => {
      console.log(responses);
      app.innerHTML = ResponsesPage(responses);
    });
  });
}

function reviews() {
  const reviewElement = document.querySelector(".nav__list_reviews");
  reviewElement.addEventListener("click", () => {
    app.innerHTML = ReviewsPage();
  });
}

function about() {
  const aboutElement = document.querySelector(".footer_list_aboutUs");
  aboutElement.addEventListener("click", () => {
    app.innerHTML = AboutUsPage();
  });
}

function contact() {
  const contactElement = document.querySelector(".footer_list_contactUs");
  contactElement.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = ContactUsPage();
  });
}

function legal() {
  const legalElement = document.querySelector(".footer_list_legal");
  legalElement.addEventListener("click", () => {
    app.innerHTML = LegalPage();
  });
}

function slideShow() {
  const slideshows = document.querySelectorAll('.slideshow');
  console.log(slideshows);
  slideshows.forEach(initSlideShow);
    }
    function initSlideShow(slideshow) {
      var slides = slideshow.querySelector('div').querySelectorAll('.slideShowGrid');
      
      var index = 0, time = 5000;
      slides[index].classList.add('active');  
      setInterval( () => {
        console.log(slides);
      slides[index].classList.remove('active');
      index++;
      if (index === slides.length) index = 0; 
      slides[index].classList.add('active');
      }, time);
      }
      function home() {
        const homeElement = document.querySelector(".nav__list_home");
        homeElement.addEventListener("click", () => {
          app.innerHTML = HomePage();
          slideShow();
        });
      }




