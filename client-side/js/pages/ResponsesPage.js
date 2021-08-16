export default function ResponsesPage(responses) {
  return `
  <h1>Resources Page</h1>
  </br>
 <div class="userClassContainer">
  ${responses.map((response) => {
      return `
    <div class="user_response">
    <span class="mood_response">We hear you! You feel ${response.mood.mood},
    <input type='hidden' id='moodId' value='${response.mood.mood}'></span>
    <span class="trigger_response"> because of ${response.trigger.name},</span>
    <input type='hidden' id='triggerId' value='${response.trigger.id}'>
    <span class="copingMechanism_response">which causes you to ${response.copingMechanism.title}.</span>
    <input type='hidden' id='copingMechanismId' value='${response.copingMechanism.id}'>
    </br>
    </br>
    <center><h2><center>Resources For Being ${response.mood.mood}</center></h2>
    </br>
    <div class="img-one">
    <a href="link" target="blank">
    <img class="alignnone size-full wp-image-1303" src="${response.mood.moodImage} alt="" width="850" height="1250" />
    </a></div>
    <p class = "mood_definition"><center>${response.mood.moodDefinition}</center></p>
    </br>
    <h4>10 Minute Meditation</h4>
    ${response.mood.moodVideo}
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">${response.mood.moodArticle1}</p>
    <p class = "mood_article">${response.mood.moodArticle2}</p>
    <p class = "mood_article">${response.mood.moodArticle3}</p>
    </br>
    <h4>Free Support Hotlines</h4>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource3}</p>
    </br>
    </br>
    <h2><center>${response.trigger.name} Resources</center></h2>
    <p class = "mood_definition"><center>${response.trigger.description}</center></p>
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">${response.trigger.triggerArticle1}</p>
    <p class = "mood_article">${response.trigger.triggerArticle2}</p>
    <p class = "mood_article">${response.trigger.triggerArticle3}</p>
    </br>
    <h4>Free Support Hotlines</h4>
    <p class = "mood_phoneNumbers">${response.trigger.triggerPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.trigger.triggerPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.trigger.triggerPhoneResource3}</p>
    </br>
    </br>
    <h2><center>${response.copingMechanism.title} Resources</center></h2>
    <center><img src = ${response.copingMechanism.copingMechanismImage} width="300" height="300" ></center>
    <p class = "mood_definition"><center>${response.copingMechanism.description}</center></p>
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle1}</p>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle2}</p>
    <p class = "mood_article">${response.copingMechanism.copingMechanismArticle3}</p>
    </br>
    <h4>Free Support Hotlines</h4>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.copingMechanism.copingMechanismPhoneResource3}</p>
      `;
    })
    .join("")}
    </div></center> 
  `;
}