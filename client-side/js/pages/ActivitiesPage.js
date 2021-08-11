export default function ActivitiesPage(activities) {
    return `
    <h1>Activities Page</h1>
    <div class='activities-list'>
        ${activities.map(activity => {
            return `
                <h2 class="activities-list__title">${activity.title}</h2>
                <input type='hidden' id=activityId value='${activity.id}'/>
                <p class="activities-list__description">${activity.description}</p>
            `;
        })}
    </div>
    `;
}