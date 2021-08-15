export default function IntakeForm() {
  return `
    <div class="intake">
   
    <input type='text' class='firstName' placeholder='First Name'>
    <input type='text' class='lastName' placeholder='Last Name'>
    <input type='text' class='ethnicity' placeholder='Ethnicity'>
    <input type='text' class='city' placeholder='City'>
    <input type='text' class='state' placeholder='State'>
    <input type='text' class='status' placeholder='Status'>
    <input type='text' class='aboutMe' placeholder='About Me [Enter Profile Description]'>
    <button class="submitProfile">Continue</button>
    </div>
   
    
    `;
}
