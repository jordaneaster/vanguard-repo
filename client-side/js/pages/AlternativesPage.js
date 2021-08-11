export default function AlternativesPage(alternatives) {
  return `
    <h1>Alternatives Page</h1>
    <div class='alternatives-constructor'>
    ${alternatives.map(alternative => {
        return `
        <p class='alternatives-constructor__title'>Alternative Title: ${alternative.title}
          <input type='hidden' id='alternativeId' value='${alternative.id}'>
        </p>
        <p class='alternatives-constructor__description'>Alternative Description: ${alternative.description}</p>
        `
    }).join('')}
    </div>
    `;
}