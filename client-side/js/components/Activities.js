import Activity from './Activity';

export default function Activities(activities) {
    return `
        <div class="activities__container">
            ${activities.map(activity => {
                return `
                    ${Activity(activity)}
                `;
            }).join('')}
        </div>
    `;
}