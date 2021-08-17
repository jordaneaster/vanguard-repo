import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function TriggerResourcePage(trigger){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </br>
 <div class="userClassContainer">
  ${trigger.map((trigger) => {
      return `
      <h2><center>${trigger.trigger.name} Resources</center></h2>
      </br>
      <center><img src = ${trigger.trigger.triggerImage} width="300" height="300" ></center>
      </br>
      </br>
      <h4>Articles</h4>
      <p class = "mood_article">${trigger.trigger.triggerArticle1}</p>
      <p class = "mood_article">${trigger.trigger.triggerArticle2}</p>
      <p class = "mood_article">${trigger.trigger.triggerArticle3}</p>
      </br>
      <h4>Free Support Hotlines</h4>
      <p class = "mood_phoneNumbers">${trigger.trigger.triggerPhoneResource1}</p>
      <p class = "mood_phoneNumbers">${trigger.trigger.triggerPhoneResource2}</p>
      <p class = "mood_phoneNumbers">${trigger.trigger.triggerPhoneResource3}</p>
      </br>
      <h3 class = "mood_disclaimer"><center>Disclaimer: ${trigger.trigger.triggerDisclaimer}</center></h3>
      `;
    })
    .join("")}
    </div></center> 
  `;
}