export default function Header() {
  return `
  <nav>
  	<input type="checkbox">
	<label>&equiv;</label>
  <ul class="nav__header" id="myLinks">
    <li class='link nav__list_home' id="toggleNav">Home</li>
    <li class='link nav__list_profile' id="toggleNav">Profile</li>
    <li class='link nav__list_assessment' id="toggleNav">Assessment</li>
    <li class='link nav__list_activities' id="toggleNav">Activities</li>
    <li class='link nav__list_message' id="toggleNav">My Messages</li>
    <li class='link nav__list_messageBoard' id="toggleNav">Message Board</li>
    <li class='link nav__list_appointment' id="toggleNav">Appointment</li>
    <li class='link nav__list_responses' id="toggleNav">Responses</li>
  </ul>
     <a class="icon" id="toggleNav">
    <i class="fa fa-bars"></i>
</nav>
        `;
}