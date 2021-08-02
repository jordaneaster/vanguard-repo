export default function CopingMechanismsPage(copingMechanisms){
    return `
    <h1>Coping Mechanisms Page</h1>
    <div class='copingMechanisms-constructor'>
    ${copingMechanisms.map(copingMechanism => {
        return `
        <p class='copingMechanisms-constructor__title'>Coping Mechanism Title: ${copingMechanism.title}
          <input type='hidden' id='copingMechanismId' value='${copingMechanism.id}'>
        </p>
        <p class='copingMechanism-constructor__description'> Coping Mechanism Description: ${copingMechanism.description}</p>
    ${copingMechanism.consequence.map(consequence => {
        return `
        <p class='copingMechanisms-constructor__consequence-title'>Consequence Title: ${consequence.title}
          <input type='hidden' id='consequenceId' value='${consequence.id}'>
        </p>
        <p class='copingMechanisms-constructor__consequence-description'>Consequence Description: ${consequence.description}
      </p>
        `
    }).join('')}
    `
    }).join('')}
    </div>
    `;
}