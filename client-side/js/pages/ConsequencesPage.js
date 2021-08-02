export default function ConsequencesPage(consequences){
    return `
    <h1>Consequences Page</h1>
    <div class='consequences-constructor'>
    ${consequences.map(consequence => {
        return `
        <p class='consequences-constructor__title'>Consequence Title: ${consequence.title}
          <input type='hidden' id='consequencesId' value='${consequence.id}'>
        </p>
        <p class='consequences-constructor__description'>Consequence Description: ${consequence.description}</p>
    ${consequence.results.map(result => {
        return `
        <p class='consequences-constructor__result-title'>Result Title: ${result.title}
          <input type='hidden' id='resultId' value='${result.id}'>
        </p>
        <p class='consequences-constructor__result-impact'>Result Impact: ${result.impact}
      </p>
        `
    }).join('')}
    `
    }).join('')}
    </div>
    `;
}
