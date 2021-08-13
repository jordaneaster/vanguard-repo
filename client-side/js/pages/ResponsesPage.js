export default function ResponsesPage(responses) {
  return `
  <div class="userClass">
  ${responses
    .map((response) => {
      return `
    <div class="user_response">
    <span class="mood_response">We hear you! You feel ${response.mood.mood}</span>
    <input type='hidden' id='moodId' value=${response.mood.id}>
    <span class="trigger_response"> because of ${response.trigger.name}</span>
    <input type='hidden' id='triggerId' value=${response.trigger.id}>
    <span class="copingMechanism_response">which causes you to ${response.copingMechanism.title}.</span>
    <input type='hidden' id='copingMechanismId' value=${response.copingMechanism.id}>
   </div>
   </br>
   <div>
    <h3 class="closing_para">Here are a list of resources to assist you.</h3>
    </div>
    </br>
    <p><b>Resources for feeling ${response.mood.mood}</b></p>
    </br>
    <p><b>Resources for ${response.trigger.name}</b></p>
    </br>
    <p><b>Resources for ${response.copingMechanism.title}</b></p>
      `;
    })
    .join("")}
  `;
}