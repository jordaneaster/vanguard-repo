export default function HealthyResponse(response){

    return `
    <h1>My Healthy Response</h1>

    ${response.map((myResponse)=>{
        return `
        <div class="healthyResponse">
        <h1 class="responseAlert">You have a new response!</h1>

        <div class="myResponse">
        <button class="responseMood">To feel: ${myResponse.mood.mood}</button>
        <p class="moodDescription">${myResponse.mood.moodDisclaimer}</p>
        
        <button class="responseCoping">Why not try, ${myResponse.copingMechanism.title}</button>
        <p class="copingDescription">${myResponse.copingMechanism.copingDisclaimer}</p>
        <div class="responseDecriptions">
        <h1 class ="learnMore">Learn More Healthy Coping Methods</h1>
        
       

        </div>
        </div>
        `
    })}
    </div>
    `

}