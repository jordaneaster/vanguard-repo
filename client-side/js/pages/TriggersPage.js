export default function TriggersPage(triggers){
    return `
    <h1>Triggers Page</h1>
    <div class='triggers-constructor'>
    ${triggers.map(trigger => {
        return `
        <p class='triggers-constructor__name'>Trigger Name: ${trigger.name}
          <input type='hidden' id='triggersId' value='${trigger.id}'>
        </p>
        <p class='triggers-constructor__description'> Trigger Description: ${trigger.description}</p>
    ${trigger.copingMechanism.map(coping => {
        return `
        <p class='triggers-constructor__coping-Mechanism-title'>Coping Mechanism Title: ${coping.title}
          <input type='hidden' id='copingMechanismId' value='${coping.id}'>
        </p>
        <p class='triggers-constructor__copingMechanism-description'>Coping Mechanism Description: ${coping.description}
      </p>
        `
    }).join('')}
    `
    }).join('')}
    </div>
    `;
}