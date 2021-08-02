export default function ResultsPage(results){
    return `
<h1>Results page</h1>
<div class='results-constructor'>
${results.map(result => {
    return `
    <p class='results-constructor__title'>Result Title: ${result.title}
      <input type='hidden' id='resultsId' value='${result.id}'>
    </p>
    <p class='results-constructor__description'>Result Description: ${result.description}</p>
${result.alternatives.map(alternatives => {
    return `
    <p class='results-constructor__alternatives-title'>Alternative Title: ${alternatives.title}
      <input type='hidden' id='alternativesId' value='${alternatives.id}'>
    </p>
    <p class='results-constructor__alternative-description'>Alternative Description: ${alternatives.description}
  </p>
    `
}).join('')}
`
}).join('')}
</div>
`;
}
