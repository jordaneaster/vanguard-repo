import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
import ResetButton from "../../images/Reset.png";

export default function ResponsesPage(responses) {
  return `
  <div class = "home__container">
<img class="home__HR_logo" src="${HRLogoLong}">
 <div class="inspirational_quote__container">
  ${responses.map((response) => {
      return `
    <div class="user_response">
    <span class="mood_response">We hear you! You feel ${response.mood.mood},</span>
    <input type='hidden' id='moodId' value='${response.mood.id}'>
    <span class="trigger_response"> because of ${response.trigger.name},</span>
    <input type='hidden' id='triggerId' value='${response.trigger.id}'>
    <span class="copingMechanism_response">which causes you to ${response.copingMechanism.title}.</span>
    <input type='hidden' id='copingMechanismId' value='${response.copingMechanism.id}'>
    </div>
<div class="home__container">
        <div class="home__card">
        <img class="home_card_img" id="moodCard" src="${response.mood.moodImage}">
        <img class="home_card_img round" id="triggerCard" src="${response.trigger.triggerImage}">
        <img class="home_card_img" id="copingCard" src="${response.copingMechanism.copingMechanismImage}">
        </div>
    `
  }).join('')}
  </div>
  </div>
  `;
}