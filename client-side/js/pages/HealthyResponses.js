import "../../css/style.css";
export default function HealthyResponse(response) {
  return `
    <h1>My Healthy Response</h1>
    <div class="healthyResponse">
    ${response
      .map((myResponse) => {
        return `
        
        <h1 class="responseAlert">You have a new response!</h1>

        <div class="myResponse">
        <img class="moodPhoto" src=${myResponse.mood.moodImage}>
        <button class="responseMood">To feel: ${myResponse.mood.mood}</button>
       
        <p class="moodDescription">${myResponse.mood.moodDisclaimer}</p>
        </img>

        <h1 class ="learnMore">Learn More Healthy Coping Methods</h1>
        
        <button class="responseCoping" data-toggle="copingDescription" data-target="#toCope">Try, ${myResponse.copingMechanism.title}</button>
        
        <p class="copingDescription" id="toCope">${myResponse.copingMechanism.copingDisclaimer}</p>
        
        </div>
       
        `;
      })
      .join("")}
    </div>
    `;
}
