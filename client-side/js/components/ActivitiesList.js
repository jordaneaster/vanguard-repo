export default function ActivitiesPage(activities) {
    return`
        <h1>Activities</h1>
        <ul class="activities-list">
            ${activities.map(activity => {
                console.log(activity);
                return `
                    <li class="activities-list__name">${activity.title}</li>
                `;
            }).join('')}
        </ul>
    `;
}