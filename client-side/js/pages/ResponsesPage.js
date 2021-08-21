import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";

export default function ResponsesPage(responses) {
  return `
  <div class = "response__container">
<img class="home__HR_logo" src="${HRLogoLong}">
 <div class="response_quote__container">
  ${responses.map((response) => {
      return `
    <div class="user_response">
    <span class="mood_response">We hear you! You feel</span>
    <span style = "text-transform:lowercase">${response.mood.mood},</span>
    <input type='hidden' id='moodId' value='${response.mood.id}'>
    <span class="trigger_response" style = "text-transform:lowercase"> because of ${response.trigger.name},</span>
    <input type='hidden' id='triggerId' value='${response.trigger.id}'>
    <span class="copingMechanism_response" style = "text-transform:lowercase">which causes you to ${response.copingMechanism.title}.</span>
    <input type='hidden' id='copingMechanismId' value='${response.copingMechanism.id}'>
    </div>
<div class="response__card_container">
        <div class="response__card">
        <img class="response_card_img" id="moodCard" src="${response.mood.moodImage}">
        <img class="response_card_img" id="triggerCard" src="${response.trigger.triggerImage}">
        <img class="response_card_img" id="copingCard" src="${response.copingMechanism.copingMechanismImage}">
        </div>
    `
  }).join('')}
  </div>
  </div>
  `;
}