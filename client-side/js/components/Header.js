import "../../css/header_footer.css";

export default function Header() {
  return `
  <nav>
  	<input type="checkbox">
	<label>&equiv;</label>
        <ul  class="nav__header">
            <li class='nav__list_home'>Home</li>
            <li class='nav__list_message'>My Messages</li>
            <li class='nav__list_profile'>Profile</li>
            <li class='nav__list_messageBoard'>Message Board</li>
            <li class='nav__list_moods'>Moods</li>
            <li class='nav__list_triggers'>Triggers</li>
            <li class='nav__list_coping_mechanisms'>Coping Mechanisms</li>
            <li class='nav__list_consequences'>Consequences</li>
            <li class='nav__list_results'>Results</li>
            <li class='nav__list_alternatives'>Alternatives</li>
            <li class='nav__list_responses'>Responses</li>
            <li class='nav__list_activities'>Activities</li>
            <li class='nav__list_reviews'>Reviews</li>
            <li class='nav__list_appointment'>Appointment</li>
        </ul>
    </nav>
        `;
}
