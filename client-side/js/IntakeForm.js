import '../css/style.css'

export default function IntakeForm() {
  return `

    <div class="intake">
    <input type='text' style="width: 300px;" class='firstName intakeF' placeholder='First Name'>
    </br>
    <input type='text' style="width: 300px;" class='lastName intakeF' placeholder='Last Name'>
    </br>
    <input type='text' style="width: 300px;" class='ethnicity intakeF' placeholder='Ethnicity'>
    </br>
    <input type='text' style="width: 300px;" class='city intakeF' placeholder='City'>
    </br>
    <input type='text' style="width: 300px;" class='state intakeF' placeholder='State'>
    </br>
    <input type='text' style="width: 300px;" class='status intakeF' placeholder='Status'>
    </br>
    <input type='text' style="width: 300px;" class='aboutMe intakeF' placeholder='About Me [Enter Profile Description]'>
    </br>
    <button class="submitProfile">Continue</button>
    </div>
    `;
}
