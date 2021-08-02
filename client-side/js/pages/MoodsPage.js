export default function MoodsPage(moods){
    return `
    <h1>Moods Page</h1>
    <div class='moods-constructor'>
    ${moods.map(mood => {
        return `
        <p class='moods-constructor__title'>Mood: ${mood.mood}
          <input type='hidden' id='moodsId' value='${mood.id}'>
        </p>
    ${mood.trigger.map(trigger => {
        return `
        <p class='moods-constructor__trigger-title'>Trigger Name: ${trigger.name}
          <input type='hidden' id='triggerId' value='${trigger.id}'>
        </p>
        <p class='moods-constructor__trigger-description'>Trigger Description: ${trigger.description}
      </p>
        `
    }).join('')}
    `
    }).join('')}
    </div>
    `;
}