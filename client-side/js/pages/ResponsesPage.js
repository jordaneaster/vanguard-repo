export default function ResponsesPage(responses) {
  return `
    <h1>Responses page</h1>
    <div class='responses-constructor'>
    ${responses.trigger.map(trigger => {
      return `
      <p class='responses-constructor__trigger-name'>Trigger Name: ${trigger.name}
      <input type='hidden' id='triggerId' value='${trigger.id}'>
      </p>
      <p class='responses-constructor__trigger-description'> Trigger Description: ${trigger.description}</p>
  ${responses.copingMechanism.map(coping => {
      return `
      <p class='responses-constructor__coping-Mechanism-title'>Coping Mechanism Title: ${coping.title}
      <input type='hidden' id='copingId' value='${coping.id}'>
      </p>
      <p class='responses-constructor__copingMechanism-description'>Coping Mechanism Description: ${coping.description}
    </p>
      `
  }).join('')}
  `
  }).join('')}
  </div>
    `;
}