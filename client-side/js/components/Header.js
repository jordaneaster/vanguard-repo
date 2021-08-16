export default function Header() {
  return `
  <nav>
  	<input class="icon" type="checkbox">
	<label>&equiv;</label>
  <ul class="nav__header" id="myLinks">
    <li class='link nav__list_home'>Home</li>
    <li class='link nav__list_profile'>Profile</li>
    <li class='link nav__list_assessment'>Assessment</li>
    <li class='link nav__list_activities'>Activities</li>
    <li class='link nav__list_message'>My Messages</li>
    <li class='link nav__list_messageBoard'>Message Board</li>
    <li class='link nav__list_appointment'>Appointment</li>
    <li class='link nav__list_responses'>Responses</li>
  </ul>
   
</nav>
        `;
}