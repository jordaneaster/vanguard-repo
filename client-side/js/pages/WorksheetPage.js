import Worksheet from '../components/Worksheet';

export default function WorksheetPage(worksheet) {
    console.log('hi from worksheet page');
    console.log(worksheet);
    return `
        <h1>Worksheet Page</h1>
        ${Worksheet(worksheet)}
    `;
}