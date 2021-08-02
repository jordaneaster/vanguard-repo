export default function InspirationalQuote(quote, index) {
    // console.log(index)
    // console.log(quote);
    return `
    <div class='inspirational_quote__container'>
    <blockquote>&ldquo;${quote.text}&rdquo;  <footer>&mdash;${quote.author}</footer></blockquote>
    </div>
    `;
}

// ${InspirationalQuote(quote)}