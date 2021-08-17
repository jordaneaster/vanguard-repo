import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function CopingResourcePage(coping){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </div>
    <div class="userClassContainer">
  ${coping.map((response) => {
      return `
      <center><h2><center>${response.copingMechanism.title} Resources</center></h2>
    </br>
    <center><img src = ${response.copingMechanism.copingMechanismImage} width="400" height="400" ></center>
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle1}</p>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle2}</p>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle3}</p>
    </br>
    <h4>Free Resources For Support</h4>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource3}</p>
    </br>
    <h3 class = "mood_disclaimer"><center>Disclaimer: ${response.copingMechanism.copingDisclaimer}</center></h3>
    `;
    })
    .join("")}
    </div></center> 
  `}