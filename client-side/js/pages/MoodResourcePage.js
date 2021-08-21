import "../../css/response_page.css";
import "../../css/resource_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function MoodResourcePage(moods){
    return `
    <div class ="response__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    </br>
  ${moods.map((response) => {
      return `
    <h2 class="moodHeader">Resources For Being ${response.mood.mood}</h2>
    <div class="userClassContainer">
    <div class="userDiv1">
    <center><img src = ${response.mood.moodImage} width="300" height="300" ></center></div>
    <div class="userDiv2">
    <h4>Articles</h4>
    <p class = "mood_article">How You May Be Feeling: ${response.mood.moodArticle1}</p>
    <p class = "mood_article">A Few Questions To Consider: ${response.mood.moodArticle2}</p>
    <p class = "mood_article">Helpful Tips: ${response.mood.moodArticle3}</p>
    </br>
    <h4>Free Resources For Support</h4>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource3}</p>
    </div>
    </div>
    <h4 class ="coping_disclaimer"><center>Disclaimer: ${response.mood.moodDisclaimer}</center></h4>
    `;
    })
    .join("")}
    
  `;
}

