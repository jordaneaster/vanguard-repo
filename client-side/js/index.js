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
import "../css/aboutUs.css";
import "../css/form.css";
import "../css/style.css";
import "../css/home_page.css";
import "../css/login.css";
import InboxPage from "./pages/InboxPage";
import MessageBoard from "./pages/MessageBoard";
import IntakeForm from "./IntakeForm";
import WorksheetPage from "./pages/WorksheetPage";
import InstructionPage from "./pages/InstructionPage";
import BlogPage from "./pages/BlogPage";
import MoodResourcePage from "./pages/MoodResourcePage";
import TriggerResourcePage from "./pages/TriggerResourcePage";
import CopingResourcePage from "./pages/CopingResourcePage";

const app = document.querySelector("#app");

buildPage();

function buildPage() {
  header();
  footer();
  renderUserLogin();
  home();
  responses();
  about();
  navUserProfile();
  contact();
  appointment();
  legal();
  loginDraft();
  activities();
  messageBoard();
  myInbox();
  replyPost();
  renderHeader();
  assessmentHeader();
  reviews();
}

function renderHeader() {
  const header = document.querySelector(".header");
  header.addEventListener("click", (event) => {
    console.log(event.target);
    const nav = document.querySelector(".navToggle");
    if (nav.style.display === "block") {
      nav.style.display = "none";
    } else {
      nav.style.display = "block";
    }
  });
}

function toggleNav() {
  const header = document.querySelector(".header");
  header.addEventListener("click", (event) => {
      const navItems = document.queryselector(".myLinks");
      if (navItems.style.display === "block") {
        navItems.style.display = "none";
      } else {
        navItems.style.display = "block";
      }
  });
}



function navUserProfile() {
  const profilePage = document.querySelector(".nav__list_profile");
  profilePage.addEventListener("click", () => {
    const app = document.querySelector("#app");
    apiActions.getRequest("http://localhost:8080/intake_profile", (user) => {
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
        (app.innerHTML = IntakeForm()),
        createIntakeProfile(),
        header(),
        footer(),
        home(),
        responses(),
        about(),
        navUserProfile(),
        contact(),
        appointment(),
        legal(),
        activities(),
        messageBoard(),
        myInbox(),
        replyPost(),
        assessmentHeader(),
        renderHeader(),
        reviews(),
        (users) => (app.innerHTML = userWelcome(users))
      );
    }
  });
  const headerElement = document.querySelector(".header");
  headerElement.innerHTML = "";
  const footerElement = document.querySelector(".footer");
  footerElement.innerHTML = "";
}

function createIntakeProfile() {
  app.innerHTML = IntakeForm();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("submitProfile")) {
      const firstName =
        event.target.parentElement.querySelector(".firstName").value;
      const lastName =
        event.target.parentElement.querySelector(".lastName").value;
      const ethnicity =
        event.target.parentElement.querySelector(".ethnicity").value;
      const city = event.target.parentElement.querySelector(".city").value;
      const state = event.target.parentElement.querySelector(".state").value;
      const status = event.target.parentElement.querySelector(".status").value;
      const aboutMe =
        event.target.parentElement.querySelector(".aboutMe").value;
      apiActions.postRequest(
        "http://localhost:8080/create_intake_profile",
        {
          firstName: firstName,
          lastName: lastName,
          ethnicity: ethnicity,
          city: city,
          state: state,
          status: status,
          aboutMe: aboutMe,
        },
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
      const trigger =
        event.target.parentElement.querySelector(".intakeTrigger").value;
      const copingMechanism =
        event.target.parentElement.querySelector(".intakeCoping").value;
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
          } else if (r == false) {
            apiActions.getRequest(
              "http://localhost:8080/intake_profile",
              (user) => {
                app.innerHTML = userWelcome(user);
              }
            );
          }
        },
        (responses) => (app.innerHTML = ResponsesPage(responses)),
        console.log(responses)
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

function loginDraft() {
  const homeElement = document.querySelector(".loginButton");
  homeElement.addEventListener("click", () => {
    app.innerHTML = HomePage();
  });
  const headerElement = document.querySelector(".header");
  headerElement.innerHTML = "";
  const footerElement = document.querySelector(".footer");
  footerElement.innerHTML = "";
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

        (messages) => (app.innerHTML = MessageBoard(messages)),
        alert("Message Sent!")
      );
    }
  });
}

function myInbox() {
  const myMessages = document.querySelector(".nav__list_message");
  myMessages.addEventListener("click", () => {
    apiActions.getRequest;
  });
}

function replyPost() {
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("replyButton")) {
      const content =
        event.target.parentElement.querySelector(".replycontent").value;

      apiActions.postRequest(
        "http://localhost:8080/post_message",
        {
          subject: subject,
          title: title,
          content: content,
        },
        console.log(content),

        alert("Reply Sent!"),

        (messages) => (app.innerHTML = MessageBoard(messages)),
        (message) => (app.innerHTML = InboxPage(message))
      );
    }
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

function myInbox() {
  const myMessages = document.querySelector(".nav__list_message");
  myMessages.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/view_messages", (messages) => {
      app.innerHTML = InboxPage(messages);
    });
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
      moodCard();
      triggerCard();
      copingCard();
    });
  });
}

function reviews() {
  const reviewElement = document.querySelector(".footer_list_reviews");
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
    populateAssessmentMenu();
  });
}

function assessmentHeader() {
  const assessElement = document.querySelector(".nav__list_assessment");
  assessElement.addEventListener("click", () => {
    console.log("Firing!");
    app.innerHTML = AssessmentPage();
    populateAssessmentMenu();
  });
}

function profileCardHome() {
  const homeCards = document.querySelector("#profileCard");
  homeCards.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/intake_profile", (user) => {
      app.innerHTML = userWelcome(user);
    });
  });
}
function assessmentCardHome() {
  const assessmentCard = document.querySelector("#assessment");
  assessmentCard.addEventListener("click", () => {
    app.innerHTML = AssessmentPage();
  });
}
function activitiesCardHome() {
  const activitiesCard = document.querySelector("#activities");
  activitiesCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/activities", (activities) => {
      app.innerHTML = ActivitiesPage(activities);
    });
  });
}
function inboxCardHome() {
  const inboxCard = document.querySelector("#messages");
  inboxCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/view_messages", (messages) => {
      app.innerHTML = InboxPage(messages);
    });
  });
}
function communityMessageBoardCard() {
  const communityCard = document.querySelector("#messageBoard");
  communityCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/view_messages", (messages) => {
      app.innerHTML = MessageBoard(messages);
    });
  });
}
function appointmentCard() {
  const appt = document.querySelector("#appointment");
  appt.addEventListener("click", () => {
    app.innerHTML = AppointmentPage();
  });
}
function resourcesCard() {
  const resources = document.querySelector("#resources");
  resources.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/responses", (responses) => {
      app.innerHTML = ResponsesPage(responses);
      moodCard();
      triggerCard();
      copingCard();
    });
  });
}

function blogCard() {
  const blog = document.querySelector("#blog");
  blog.addEventListener("click", () => {
    app.innerHTML = BlogPage();
  });
}
function home() {
  const homeElement = document.querySelector(".nav__list_home");
  homeElement.addEventListener("click", () => {
    app.innerHTML = HomePage();
    profileCardHome();
    assessmentCardHome();
    activitiesCardHome();
    inboxCardHome();
    communityMessageBoardCard();
    appointmentCard();
    resourcesCard();
    blogCard();
    const url = "https://type.fit/api/quotes";
    const quoteDiv = document.querySelector(".inspirational_quote__container");
    getAffirmationApi(url, quoteDiv);
  });
}

function getAffirmationApi(url, quoteDiv) {
  // const affirmation_api_url ="https://zenquotes.io/api/quotes/";
  // const affirmation_api_url = 'https://zenquotes.io/api/today/';

  apiActions.getRequest(url, (quotes) => {
    quoteDiv.innerHTML = InspirationalQuote(
      quotes[Math.floor(Math.random() * quotes.length)]
    );
    // quotes.forEach((quote, index) => {
    //   quoteDiv.innerHTML = InspirationalQuote(quote);
    // });
  });

  // apiActions.getRequest(url, (quote) => {
  //     console.log(quote);
  //     quoteDiv.innerHTML = InspirationalQuote(quote[0]);
  // });
}

function activities() {
  let worksheetsJson;
  let worksheet;
  let instruction;
  apiActions.getRequest("http://localhost:8080/worksheets", (worksheets) => {
    worksheetsJson = worksheets;
  })
  const activitiesElement = document.querySelector('.nav__list_activities');
  activitiesElement.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/activities", (activities) => {
      app.innerHTML = ActivitiesPage(activities);
      const activityTitles = document.querySelectorAll('.activity__title');
      activityTitles.forEach((activityTitle) => {
        activityTitle.addEventListener('click', (event) => {
          const worksheetId = event.target.parentElement.parentElement.querySelector('.worksheetId').value;
          const pageType = event.target.parentElement.parentElement.querySelector('.page').value;
          let displayUrl = event.target.parentElement.parentElement.querySelector('.displayUrl').value;
          // console.log('Display URL: ' + displayUrl);
          worksheetsJson.forEach((sheet) => {
            if ((pageType === 'forms') && (worksheetId == sheet.id)) {
              worksheet = sheet;
              // console.log('Display URL: ' + displayUrl);
              app.innerHTML = WorksheetPage(worksheet, displayUrl);
            } else if ((pageType === 'instructions') && (worksheetId == sheet.id)) {
              instruction = sheet;
              // console.log('Display URL: ' + displayUrl);
              // app.innerHTML = InstructionPage(instruction, displayUrl);
              app.innerHTML = InstructionPage(displayUrl);
            }
          });
        });
      });
    });
  });
}

function moodCard() {
  const moodCard = document.querySelector("#moodCard");
  moodCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/responses", (mood) => {
      app.innerHTML = MoodResourcePage(mood);
    });
  });
}

function triggerCard() {
  const triggerCard = document.querySelector("#triggerCard");
  triggerCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/responses", (trigger) => {
      app.innerHTML = TriggerResourcePage(trigger);
    });
  });
}

function copingCard() {
  const copingCard = document.querySelector("#copingCard");
  copingCard.addEventListener("click", () => {
    apiActions.getRequest("http://localhost:8080/responses", (coping) => {
      app.innerHTML = CopingResourcePage(coping);
    });
  });
}

// function reset() {
//   const resetElement = document.querySelector(".reset-button");
//   resetElement.addEventListener("click", () => {
//     console.log("firing!"),
//     location.reload();
//   })}



// function putWorksheet() {
//   app.addEventListener('click', (event) => {
//     console.log('Event target classlist: ' + event.target.classList)
//     if (event.target.classList.contains('activity__title')) {
//       const activity = event.target;
//       console.log('Activity: ' + activity);
//       // if (activity.)
//     }
//   });
//   // renderWorksheet();
// }

// function renderWorksheet() {
//   app.addEventListener('click', (event) => {
//     console.log('Event target classlist: ' + event.target.classList)
//     if (event.target.classList.contains('activity__title')) {
//       const activity = event.target;
//       console.log('Activity: ' + activity);
//       // if (activity.)
//     }
//   });
// }
