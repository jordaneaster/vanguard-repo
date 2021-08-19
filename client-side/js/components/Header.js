import HRHeaderLogo from "../../images/hr-logo-heart.png"

export default function Header() {
  return `
  <nav>
  <img src="${HRHeaderLogo}">
  	<input type="checkbox">
	<label>&equiv;</label>
  <ul class="nav__header">
    <li class='nav__list_home'>Home</li>
    <li class='nav__list_profile'>Profile</li>
    <li class='nav__list_assessment'>Assessment</li>
    <li class='nav__list_activities'>Activities</li>
    <li class='nav__list_message'>My Messages</li>
    <li class='nav__list_messageBoard'>Message Board</li>
    <li class='nav__list_appointment'>Appointment</li>
    <li class='nav__list_responses'>Responses</li>
  </ul>
</nav>
        `;
}