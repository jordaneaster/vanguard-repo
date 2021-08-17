import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function MoodResourcePage(moods){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </div>
    <div class="userClassContainer">
  ${moods.map((response) => {
      return `
      <center><h2><center>Resources For Being ${response.mood.mood}</center></h2>
    </br>
    <center><img src = ${response.mood.moodImage} width="400" height="400" ></center>
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">How You May Be Feeling: ${response.mood.moodArticle1}</p>
    <p class = "mood_article">A Few Questions To Consider: ${response.mood.moodArticle2}</p>
    <p class = "mood_article">Helpful Tips: ${response.mood.moodArticle3}</p>
    </br>
    <h4>Free Resources For Support</h4>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource3}</p>
    </br>
    <h3 class = "mood_disclaimer"><center>Disclaimer: ${response.mood.moodDisclaimer}</center></h3>
    `;
    })
    .join("")}
    </div></center> 
  `;
}
