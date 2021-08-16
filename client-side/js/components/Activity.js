// import Worksheet from './Worksheet';

export default function Activity(activity) {
    console.log(activity);
    return `
        <div class="activity__container">
            <input type='hidden' class='activityId' value=${activity.id}/>
            <input type='hidden' class='worksheetTitle' value=${activity.worksheet.title} + '.js'/>
            ${ returnWorksheetUrl(activity) }
            <a class='activity__title' href='#'><h2>${activity.title}</h2></a>
            <p class='activities-list__description'>${activity.description}</p>
        </div>
    `;
}

function returnWorksheetUrl(activity) {
    if (activity.worksheet.acceptUserInput) {
        return `
        <input type='hidden' class='worksheetPage' value='./activity-instructions/${activity.worksheet.title}.js'/>
        `
    } else {
        return `
        <input type='hidden' class='worksheetPage' value='./worksheet-forms/${activity.worksheet.title}.js'/>
        `
    }
}
