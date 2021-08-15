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
import AssessmentPage from "./pages/AssessmentPage";
import AppointmentPage from "./pages/AppointmentPage";
import ContactUsPage from "./pages/ContactUsPage";
import LegalPage from "./pages/LegalPage";
import InspirationalQuote from "./components/InspirationalQuote";
import LoginPage from "./pages/LoginPage";
import LoginDraft from "./pages/LoginPage";
import ActivitiesPage from "./pages/ActivitiesPage";
import Outbox from "./pages/Outbox";
import "../css/header_footer.css";
import "../css/aboutUS.css";
import "../css/form.css";
import "../css/style.css";
import "../css/home_page.css";
import "../css/login.css";
import InboxPage from "./pages/InboxPage";
import MessageBoard from "./pages/MessageBoard";
import IntakeForm from "./IntakeForm";

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
  navUserProfile();
  contact();
  appointment();
  legal();
  loginDraft();
  activities();
  messageBoard();
}
console.log();

function navUserProfile() {
  const profilePage = document.querySelector(".nav__list_profile");
  profilePage.addEventListener("click", () => {
    const app = document.querySelector("#app");
    apiActions.getRequest("http://localhost:8080/users", (user) => {
      app.innerHTML = userWelcome(user);
    });
  });
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
  app.innerHTML = LoginDraft();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("loginButton")) {
      const userName =
        event.target.parentElement.querySelector(".userName").value;
      const password =
        event.target.parentElement.querySelector(".password").value;
      apiActions.postRequest(
        "http://localhost:8080/create_user_profile",
        {
          userName: userName,
          password: password,
        },
        (app.innerHTML =),
        assessment(),
        (users) => (app.innerHTML = userWelcome(users))
      );
    }
  });
}
function populateAssessmentMenu() {
  app.innerHTML = AssessmentPage();
  const assessmentButton = document.querySelector(".assessBtn");
  assessmentButton.addEventListener("click", (event) => {
    if (
      event.target.parentElement.parentElement.querySelector(".assessmentMenu")
    ) {
      const mood =
        event.target.parentElement.querySelector(".intakeMood").value;
      console.log(mood);
      const trigger =
        event.target.parentElement.querySelector(".intakeTrigger").value;
      console.log(trigger);
      const copingMechanism =
        event.target.parentElement.querySelector(".intakeCoping").value;
      console.log(copingMechanism);
      apiActions.postRequest(
        "http://localhost:8080/send_response",
        {
          mood: mood,
          trigger: trigger,
          copingMechanism: copingMechanism,
        },
        function myFunction() {
          var r = confirm("Would you like to leave a message for an Admin?");
          if (r == true) {
            app.innerHTML = Outbox();
            outbox();
          } else {
            apiActions.getRequest("http://localhost:8080/users", (user) => {
              app.innerHTML = userWelcome(user);
            });
          }
        },
        (responses) => (app.innerHTML = ResponsesPage(responses))
      );
    }
  });
}
function replyPost() {
  app.innerHTML = MessageBoard();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("replyButton")) {
      console.log(event);
      // const content = event.target.parentElement.querySelector('.replycontent').value;
    }
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
  const homeElement = document.querySelector(".loginButton");
  homeElement.addEventListener("click", () => {
    app.innerHTML = HomePage();
  });
}

function moods() {
  const moodElement = document.querySelector(".nav__list_moods");
  moodElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/moods", (moods) => {
      app.innerHTML = MoodsPage(moods);
    });
  });
}

function messageBoard() {
  const messageBoard = document.querySelector(".nav__list_messageBoard");
  messageBoard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/view_messages", (messages) => {
      app.innerHTML = MessageBoard(messages);
    });
  });
}

function outbox() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("sendMessage")) {
      const subject =
        event.target.parentElement.querySelector("#subject").value;
      const title = event.target.parentElement.querySelector("#title").value;
      const content =
        event.target.parentElement.querySelector("#content").value;
      apiActions.postRequest(
        "http://localhost:8080/post_message",
        {
          subject: subject,
          title: title,
          content: content,
        },
        (messages) => app.innerHTML = MessageBoard(messages),
        alert("Message Sent!")
      );
    }
  })
}

function myInbox() {
  const myMessages = document.querySelector(".nav__list_message");
  myMessages.addEventListener("click", () => {
    apiActions.getRequest;
  });
}
function triggers() {
  const triggerElement = document.querySelector(".nav__list_triggers");
  triggerElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/triggers", (triggers) => {
      app.innerHTML = TriggersPage(triggers);
    });
  });
}

function copingMechanisms() {
  const copingElement = document.querySelector(".nav__list_coping_mechanisms");
  copingElement.addEventListener("click", () => {
    apiActions.getRequest(
      "http://localhost:8080/coping",
      (copingMechanisms) => {
        app.innerHTML = CopingMechanismsPage(copingMechanisms);
      }
    );
  });
}

function consequences() {
  const consequencesElement = document.querySelector(".nav__list_consequences");
  consequencesElement.addEventListener("click", () => {
    apiActions.getRequest(
      "http://localhost:8080/consequences",
      (consequences) => {
        app.innerHTML = ConsequencesPage(consequences);
      }
    );
  });
}

function results() {
  const resultsElement = document.querySelector(".nav__list_results");
  resultsElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/results", (results) => {
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
        app.innerHTML = AlternativesPage(alternatives);
      }
    );
  });
}

function responses() {
  const responseElement = document.querySelector(".nav__list_responses");
  responseElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/responses", (responses) => {
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
    app.innerHTML = ContactUsPage();
  });
}

function appointment() {
  const appointmentElement = document.querySelector(".nav__list_appointment");
  appointmentElement.addEventListener("click", () => {
    app.innerHTML = AppointmentPage();
  });
}

function legal() {
  const legalElement = document.querySelector(".footer_list_legal");
  legalElement.addEventListener("click", () => {
    app.innerHTML = LegalPage();
  });
}

function slideShow() {
  const slideshows = document.querySelectorAll(".slideshow");
  slideshows.forEach(initSlideShow);
}
function initSlideShow(slideshow) {
  var slides = slideshow
    .querySelector("div")
    .querySelectorAll(".slideShowGrid");
  var index = 0,
    time = 5000;
  slides[index].classList.add("active");
  setInterval(() => {
    slides[index].classList.remove("active");
    index++;
    if (index === slides.length) index = 0;
    slides[index].classList.add("active");
  }, time);
}

function assessment() {
  const assessmentElement = document.querySelector(".assessmentButton");
  assessmentElement.addEventListener("click", () => {
    app.innerHTML = AssessmentPage();
  });
}

function assessment() {
  const assessmentElement = document.querySelector(".assessmentButton");
  assessmentElement.addEventListener("click", () => {
    console.log("Firing!");
    app.innerHTML = AssessmentPage();
    populateAssessmentMenu();
  });
}

function home() {
  const homeElement = document.querySelector(".nav__list_home");
  homeElement.addEventListener("click", () => {
    app.innerHTML = HomePage();
    slideShow();
    assessment();
  });
}

function getAffirmationApi(url) {
  const affirmation_api_url = "https://type.fit/api/quotes";
  // const affirmation_api_url ="https://zenquotes.io/api/quotes/";
  // const affirmation_api_url = 'https://zenquotes.io/api/today/';
  const quoteDiv = document.querySelector(".inspirational_quote__container");
  quoteDiv.onload = () => {
    apiActions.getRequest(url, (quotes) => {
      quoteDiv.innerHTML = InspirationalQuote(
        quotes[Math.floor(Math.random() * quotes.length)]
      );

      // quotes.forEach((quote, index) => {
      //   quoteDiv.innerHTML = InspirationalQuote(quote);
      // });

      // apiActions.getRequest(url, (quote) => {
      //     console.log(quote);
      //     quoteDiv.innerHTML = InspirationalQuote(quote[0]);
      // });
    });
  };
}

function activities() {
  const activitiesElement = document.querySelector(".nav__list_activities");
  activitiesElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/activities", (activities) => {
      app.innerHTML = ActivitiesPage(activities);
    });
  });
}
