import '../css/style.css'
import Welcome from "../images/Welcome_img.png"

export default function IntakeForm() {
  return `
  <div class="IntakeGrid">
  <img class="Img2__Profile" src="${Welcome}">
    <div class="intake">
    <input type='text' style="width: 300px;" class='firstName' placeholder='First Name'>
    </br>
    <input type='text' style="width: 300px;" class='lastName' placeholder='Last Name'>
    </br>
    <input type='text' style="width: 300px;" class='ethnicity' placeholder='Ethnicity'>
    </br>
    <input type='text' style="width: 300px;" class='city' placeholder='City'>
    </br>
    <input type='text' style="width: 300px;" class='state' placeholder='State'>
    </br>
    <input type='text' style="width: 300px;" class='status' placeholder='Status'>
    </br>
    <input type='text' style="width: 300px;" class='aboutMe' placeholder='About Me [Enter Profile Description]'>
    </br>
    <button class="submitProfile">Continue</button>
    </div>
    
    </div>
    `;
}
