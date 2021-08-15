export default function ResponsesPage(responses) {
  return `
  <h1>Responses from Assessment</h1>
  <div class="userClass">
  ${responses
    .map((response) => {
      return `
    <div class="user_response">
    <p class="mood_response">We hear you! You feel ${response.mood.mood},</p>
    <input type='hidden' id='moodId' value='${response.mood.id}'>
    <p class="trigger_response"> because of ${response.trigger.name},</p>
    <input type='hidden' id='triggerId' value='${response.trigger.id}'>
    <p class="copingMechanism_response">which causes you to ${response.copingMechanism.title}.</p>
    <input type='hidden' id='copingMechanismId' value='${response.copingMechanism.id}'>
      `;
    })
    .join("")}
    </div>
  `;
}