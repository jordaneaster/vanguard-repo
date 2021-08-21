import "../../css/response_page.css";
import "../../css/resource_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function CopingResourcePage(coping){
    return `
    <div class ="response__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
  ${coping.map((response) => {
      return `
     <h2 class ="copingHeader">${response.copingMechanism.title} Resources</h2>
    <div class="userClassContainer">
    <div class="userDiv1">
    <img src = ${response.copingMechanism.copingMechanismImage} width="300" height="300"></div>
    <div class="userDiv2">
    <h4>Articles</h4>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle1}</p>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle2}</p>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle3}</p>
    </br>
    <h4>Free Resources For Support</h4>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource1}</p>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource2}</p>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource3}</p>
    </div>
    </div>
    <h4 class ="coping_disclaimer"><center>Disclaimer: ${response.copingMechanism.copingDisclaimer}</center></h4>
    `;
    })
    .join("")} 
  `}